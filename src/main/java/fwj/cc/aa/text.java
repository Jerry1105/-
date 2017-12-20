package fwj.cc.aa;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import fwj.entity.User;

/*
fuwenjie



*/
@Component
@Aspect
public class text {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	// private Logger logger = LoggerFactory.getLogger(getClass());

	@Pointcut("execution(public * fwj.Async..*.*(..))")
	public void p2() {
	}

	@Around("p2()&&@annotation(select)")
	public Object dob(ProceedingJoinPoint pjp, Select select) throws Throwable {
		String[] string = select.value();
		String sql = string[0];
		Object[] args = pjp.getArgs();
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		RowMapper<User> rm = BeanPropertyRowMapper.newInstance(User.class);
		List<User> userList = jdbcTemplate.query(sql, args, rm);
		System.out.println(userList.size());
		Object object = pjp.proceed();
		object = userList.get(0);
		return object;
	}

	@Before("p2()")
	public void ccc() {
		System.out.println("***************");
	}

	// @Around(value sert)&&p2", argNames = "pjp,insert")
	// public void doBefore(ProceedingJoinPoint pjp, Insert insert) throws
	// Throwable {
	// // 接收到请求，记录请求内容
	// System.out.println("haha" + insert.value()[0]);
	// pjp.proceed();
	// System.out.println("success");
	//
	// }

}

package fwj.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class aoptext {

	@Pointcut("execution(public * fwj.controller..*.*(..))")
	public void rr() {

	}

	@Before("rr()")
	public void doBefore(JoinPoint joinPoint) {
		System.out.println("lala");
	}

}

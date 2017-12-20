package fwj.hander;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/*
fuwenjie



*/
@ControllerAdvice
public class mymy {

	@ResponseBody
	@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "你说呢")
	public String index() {
		return "page404";
	}
}

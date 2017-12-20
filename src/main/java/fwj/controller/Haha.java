package fwj.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
fuwenjie



*/
@Component
public class Haha {

	@Value("${name:9090}")
	public String name;

}

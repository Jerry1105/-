package fwj.appstart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

import fwj.importtext.ImportText;

/*
fuwenjie



*/
@ComponentScan(basePackages = { "fwj.controller", "fwj.aop", "fwj.cc.aa", "fwj.Async", "fwj.hander", "fwj.appstart",
		"fwj.Beans" })
@MapperScan(basePackages = "fwj.mapper")
@SpringBootApplication
@ImportText(value = { "fwj.Beans" })
@EnableScheduling
@EnableAspectJAutoProxy
public class App {

	public static void main(String[] args) {

		System.out.println("hahaha");

		SpringApplication.run(App.class, args);

	}
}

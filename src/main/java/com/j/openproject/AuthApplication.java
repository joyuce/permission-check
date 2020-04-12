package com.j.openproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.j.openproject.demo.Test;
import com.j.openproject.utils.SpringContextUtil;

@SpringBootApplication
public class AuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);

		Test t = SpringContextUtil.getBean(Test.class) ;
		t.aaa("11");
	}

}

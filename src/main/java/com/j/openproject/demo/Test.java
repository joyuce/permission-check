package com.j.openproject.demo;

import org.springframework.stereotype.Component;

import com.j.openproject.auth.annotation.AuthCheck;

/**
 * @author Joyuce
 * @Type Test
 * @Desc
 * @date 2019年11月20日
 * @Version V1.0
 */
@Component
public class Test {

    @AuthCheck(codes = { CodeConstant.THREE }, isAnd = true)
    public void aaa(String user) {
        System.err.println("success");
    }

}

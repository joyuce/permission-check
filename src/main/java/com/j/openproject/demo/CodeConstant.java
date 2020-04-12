package com.j.openproject.demo;

import org.springframework.context.annotation.Configuration;

import com.j.openproject.auth.code.AuthCode;

/**
 * @author Joyuce
 * @Type CodeConstant
 * @Desc 权限代码常量类     @Configuration 需要项目启动就初始化此类
 * @date 2019年11月20日
 * @Version V1.0
 */
@Configuration
public class CodeConstant {

    /**
     * 定义的权限代码常量
     */
    public static final String ONE = "1";

    /**
     * 定义的权限代码常量
     */
    public static final String TWO = "2";

    /**
     * 定义的权限代码常量
     */
    public static final String THREE = "3";

    /**
     * 保存代码，关联的父级权限存在的情况，在子级无权限时，校验父级权限；父子关系，父包含子。
     */
    static {
        AuthCode.saveCode(ONE, "111", "0");
        AuthCode.saveCode(TWO, "222", "1");
        AuthCode.saveCode(THREE, "333", "2");
    }

}

package com.xc.configuration;

import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by xc on 2017/8/9.
 * 项目启动入口，配置包根路径
 */
@ComponentScan(basePackages = "com.xc")
public class Entry {
    public static void main(String[] args) {
        SpringApplication.run(Entry.class, args);
    }
}

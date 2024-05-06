package com.example.democrud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@MapperScan("com.example.democrud.mapper")
public class MybatisPlusConfig {

}

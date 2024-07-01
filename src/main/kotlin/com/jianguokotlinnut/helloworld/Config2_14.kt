package com.jianguokotlinnut.helloworld

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Lazy
import org.springframework.context.annotation.Scope

/**
 * 类描述: 基于Java类的配置
 * @author 坚果
 * @date 2024/1/27 2:10
 */

@Configuration  //表明是一个Java配置类
@ComponentScan("com.jianguokotlinnut")  //指定类扫描的包名
class Config2_14 {
    @Bean  //该方法的返回对象会被当做容器中的一个Bean
    @Lazy  //表示这个Bean是延时加载的
    @Scope("prototype")  //指定这个Bean为原型Bean
    fun helloBean() : HelloBean2_1{
        return HelloBean2_1()
    }
}
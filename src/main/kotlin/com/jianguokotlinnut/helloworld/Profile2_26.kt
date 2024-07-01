package com.jianguokotlinnut.helloworld

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

/**
 * 类描述: Profile环境抽象
 * @author 坚果
 * @date 2024/2/5 3:59
 */

//针对开发和测试环境的不同Java配置
@Configuration
@Profile("dev")  //Java类的配置方式
class DevConfig {
    @Bean
    fun hello() : HelloBean2_6{
        val hello = HelloBean2_6()
        hello.setName("dev")
        return hello
    }
}

@Configuration
@Profile("test")
class TestConfig {
    @Bean
    fun hello() : HelloBean2_6{
        val hello = HelloBean2_6()
        hello.setName("test")
        return hello()
    }
}

/*
使用ConfigurableEnvironment.setActiveProfiles()方法指定要激活的Profile，
通过ApplicationContext.getEnvironment()方法获取ConfigurableEnvironment

或者在启动程序时在命令行中添加spring.profiles.active
java -D spring.profiles.active="dev" -jar xxx.jar
 */

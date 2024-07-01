package com.jianguokotlinnut.helloworld

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * 类描述: 感知容器的启动和停止
 * @author 坚果
 * @date 2024/2/4 22:14
 */

@Configuration  //声明配置类
class Application2_25 {
    @Bean
    fun hello() : HelloLifecycle{
        return HelloLifecycle()
    }
}

fun main() {
    //AnnotationConfigApplicationContext注释配置应用程序上下文，根据注解和Java类配置ApplicationContext
    //Application2_25类用@Configuration声明了配置类，并配置了Java类Bean
    val applicationContext = AnnotationConfigApplicationContext(Application2_25::class.java)
    //flag = false
    applicationContext.start() //触发lifecycle的start()方法
    //flag = true
    val hello = applicationContext.getBean("hello",HelloLifecycle::class.java)  //取出配置类中的Bean
    println(hello.hello())
    //flag = true 输出Hello World!
    applicationContext.close() //触发lifecycle的stop()方法
    //flag = false
    println(hello.hello())
    //flag = false 输出Bye!

    /*
    Context Started.
    Hello World!
    Context Stopped.
    Bye!
     */
}
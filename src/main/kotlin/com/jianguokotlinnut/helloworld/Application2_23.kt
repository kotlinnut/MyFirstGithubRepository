package com.jianguokotlinnut.helloworld

import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

/**
 * 类描述: 容器的扩展点
 * @author 坚果
 * @date 2024/1/24 2:45
 */

//在bean初始化前后通过bean后置处理器定制自己的逻辑
class Application2_23 {
    //从类路径中加载XML文件配置ApplicationContext，将bean载入IoC容器Application
    //加载beans.xml文件
    private val applicationContext : ApplicationContext = ClassPathXmlApplicationContext("beans2-23.xml")

    fun sayHello(){
        //取得对应的bean
        val hello = applicationContext.getBean("helloBean",HelloBean2_23::class.java)
        //使用bean方法
        println(hello.hello())
    }
}
fun main(args: Array<String>) {
    //实例化容器并调用容器中的方法
    val application = Application2_23()
    application.sayHello()
    /*
    由于两个方法执行的时间特殊性，所以打印日志和记录时间意义不大，主要还是用于注入属性和完善配置
    Hello postProcessBeforeInitialization
    Hello postProcessAfterInitialization
    Hello World!
     */
}
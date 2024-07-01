package com.jianguokotlinnut.helloworld

import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

/**
 * 类描述: 通过构造函数注入参数，传入方法所需内容
 * @author 坚果
 * @date 2024/1/25 19:42
 */

class Application2_11 {
    //从类路径中加载XML文件配置ApplicationContext，将bean载入IoC容器Application
    //1.加载beans.xml文件
    private val applicationContext : ApplicationContext = ClassPathXmlApplicationContext("beans2-11.xml")

    fun sayHello(){
        //2.取得对应的bean
        val hello = applicationContext.getBean("helloBean",HelloBean2_10::class.java)
        //3.使用bean方法
        println(hello.hello())
    }
}
fun main(args: Array<String>) {
    //4.实例化容器并调用容器中的方法
    val application = Application2_11()
    application.sayHello()      //Hello World! by Spring
}
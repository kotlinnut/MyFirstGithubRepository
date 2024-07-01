package com.jianguokotlinnut.helloworld

import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

/**
 * 类描述: 第二章2-5依赖注入实例
 * @author 坚果
 * @date 2024/1/24 2:45
 */

//第二章2-5依赖注入实例
class Application {
    //从类路径中加载XML文件配置ApplicationContext，将bean载入IoC容器Application
    //加载beans.xml文件
    private val applicationContext : ApplicationContext = ClassPathXmlApplicationContext("beans.xml")

    fun sayHello(){
        //取得对应的bean
        val hello = applicationContext.getBean("helloBean",HelloBean2_1::class.java)
        //使用bean方法
        println(hello.hello())
    }
}
fun main(args: Array<String>) {
    //实例化容器并调用容器中的方法
    val application = Application()
    application.sayHello()
}
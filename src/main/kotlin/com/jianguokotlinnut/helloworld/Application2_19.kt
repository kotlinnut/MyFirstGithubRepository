package com.jianguokotlinnut.helloworld

import org.springframework.context.support.ClassPathXmlApplicationContext

/**
 * 类描述: 在运行类中增加了关闭容器的动作
 * @author 坚果
 * @date 2024/1/29 2:09
 */

class Application2_19 {
    private val applicationContext = ClassPathXmlApplicationContext("beans2-18.xml")  //加载beans文件
    fun sayHello(){
        val hello = applicationContext.getBean("hello") as Hello2_17
        println(hello.hello())
    }
    fun close(){
        applicationContext.close()
    }
}

fun main() {
    val application = Application2_19()
    application.sayHello()
    application.close()

    /*
    Hello World!
    shutdown()
    destroy()
    close()
    */

    /*
    加入了事件监听器Bean（ContextClosedEventListener类）之后的输出：
    Hello World!
    [ApplicationListener]ApplicationContext closed.
    shutdown()
    destroy()
    close()
     */
}
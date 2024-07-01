package com.jianguokotlinnut.helloworld

import org.springframework.context.support.ClassPathXmlApplicationContext
import org.springframework.stereotype.Component

@Component
class Application2_22 {
    private val applicationContext = ClassPathXmlApplicationContext("beans2-22.xml")  //加载beans文件
    fun fire(){
        val listener = applicationContext.getBean("listener") as CustomEventPublisher
        listener.fire()
    }
}

fun main() {
    val application = Application2_22()
    application.fire()

    //监听到事件，执行onEvent()方法。
    //log-----    CustomEvent Sourse: Hello
}
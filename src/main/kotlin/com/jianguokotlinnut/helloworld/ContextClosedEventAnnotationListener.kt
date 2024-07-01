package com.jianguokotlinnut.helloworld

import org.springframework.context.ApplicationListener
import org.springframework.context.event.ContextClosedEvent
import org.springframework.context.event.EventListener
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

/**
 * 类描述: 用@EventListener注解处理ContextClosedEvent事件的类
 * @author 坚果
 * @date 2024/1/29 2:33
 */

@Component  //标注Spring管理的Bean，使用@Component注解在一个类上，表示将此类标记为Spring容器中的一个Bean。
class ContextClosedEventAnnotationListener{
    @EventListener
    @Order(2) //指定处理的顺序
    fun onEvent(event: ContextClosedEvent) {
        println("[@EventListener]ApplicationContext closed.")
    }
}
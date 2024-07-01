package com.jianguokotlinnut.helloworld

import org.springframework.context.ApplicationEventPublisher
import org.springframework.context.ApplicationEventPublisherAware
import org.springframework.context.event.EventListener

/**
 * 类描述: 自定义生产事件类
 * @author 坚果
 * @date 2024/1/30 19:34
 */

class CustomEventPublisher : ApplicationEventPublisherAware{
    private lateinit var publisher : ApplicationEventPublisher
    fun fire(){
        publisher.publishEvent(CustomEvent("Hello"))
    }

    override fun setApplicationEventPublisher(applicationEventPublisher: ApplicationEventPublisher) {
        this.publisher = applicationEventPublisher
    }

    @EventListener
    fun onEvent(customEvent:CustomEvent){
        println("CustomEvent Sourse: ${customEvent.getSource()}")
    }
}

class CustomEvent(private val source:String){
    fun getSource():String = source
}
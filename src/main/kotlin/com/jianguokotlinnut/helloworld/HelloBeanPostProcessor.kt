package com.jianguokotlinnut.helloworld

import org.springframework.beans.factory.config.BeanPostProcessor

/**
 * 类描述: 定制容器的扩展点
 * @author 坚果
 * @date 2024/2/2 3:16
 */

class HelloBeanPostProcessor : BeanPostProcessor{
    //定制Bean，在Bean初始化前执行
    override fun postProcessBeforeInitialization(bean: Any, beanName: String): Any? {
        if("helloBean" == beanName){
            println("Hello postProcessBeforeInitialization")
        }
        return bean
    }

    override fun postProcessAfterInitialization(bean: Any, beanName: String): Any? {
        if("helloBean" == beanName){
            println("Hello postProcessAfterInitialization")
        }
        return bean
    }
}
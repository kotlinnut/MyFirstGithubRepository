package com.jianguokotlinnut.helloworld

import jakarta.annotation.PreDestroy
import org.springframework.beans.factory.DisposableBean

/**
 * 类描述: 生命周期动作的组合
 * @author 坚果
 * @date 2024/1/28 23:43
 */

//同时提供三个销毁的方法
/*
DisposableBean接口和InitializingBean接口一样，
为bean提供了释放资源方法的方式，
它只包括destroy方法，凡是继承该接口的类，在bean被销毁之前都会执行该方法。
 */
class Hello2_17 : DisposableBean{
    fun hello() : String {
        return "Hello World!"
    }

    override fun destroy() {
        println("destroy()")
    }

    fun close(){
        println("close()")
    }

    @PreDestroy
    fun shutdown(){
        println("shutdown()")
    }
}
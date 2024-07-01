package com.jianguokotlinnut.helloworld

//导入framework的包
import org.springframework.context.Lifecycle


/**
 * 类描述: 实现Lifecycle感知容器的启动和停止
 * @author 坚果
 * @date 2024/2/4 20:43
 */

class HelloLifecycle : Lifecycle {
    private var flag = false

    fun hello() : String {
        return if(flag) "Hello World!" else "Bye!"
    }

    override fun start() {
        println("Context Started.")
        flag = true
    }

    override fun stop() {
        println("Context Stopped.")
        flag = false
    }

    override fun isRunning(): Boolean {
        return flag
    }

}
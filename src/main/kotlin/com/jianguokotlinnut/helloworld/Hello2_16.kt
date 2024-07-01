package com.jianguokotlinnut.helloworld

import org.springframework.beans.factory.DisposableBean

/**
 * 类描述: 销毁Bean前回调动作demo类
 * @author 坚果
 * @date 2024/1/28 21:25
 */

//实现了DisposableBean接口的类
class Hello2_16 : DisposableBean{
    fun hello() : String {
        return "Hello World!"
    }

    override fun destroy() {
        println("See you next time.")
    }
}
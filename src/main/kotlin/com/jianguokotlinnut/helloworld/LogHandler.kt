package com.jianguokotlinnut.helloworld

import org.springframework.cglib.proxy.InvocationHandler
import java.lang.reflect.Method

/**
 * 类描述: 在Hello.say()前后打印日志的InvocationHandler
 * @author 坚果
 * @date 2024/2/7 21:09
 */

class LogHandler(private val source : Hello3_1) : InvocationHandler {
    //kotlin对于invoke方法体的写法与java有出入
    override fun invoke(proxy: Any?, method: Method, args: Array<out Any>?): Any? {
        //直接返回method.invoke()
        return if (method.name == "say") {
            println("调用方法前")
            method.invoke(source).also {
                println("调用方法后")
            }  //also 是一个标准库函数，其作用是将一个对象作为参数传递给 Lambda 表达式，并返回该对象本身。
        } else null   //对代理对象的操作会转为调用invoke方法
    }
}
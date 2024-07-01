package com.jianguokotlinnut.helloworld

import org.springframework.cglib.proxy.Proxy

/**
 * 类描述: 创建JDK动态代理，并调用方法
 * @author 坚果
 * @date 2024/2/7 22:06
 */

fun main() {
    val original = SpringHello() //Hello实现类的Bean实例
    val target = Proxy.newProxyInstance(Hello3_1::class.java.classLoader ,
        original.javaClass.interfaces ,
        LogHandler(original)) as Hello3_1  //创建LogHandler代理
    target.say()  //使用LogHandler代理
}
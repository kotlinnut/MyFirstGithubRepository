package com.jianguokotlinnut.helloworld

/**
 * 类描述: 要被动态代理的Hello接口及其实现片段
 * @author 坚果
 * @date 2024/2/7 21:08
 */

interface Hello3_1 {
    fun say()
}
class SpringHello : Hello3_1{
    override fun say() {
        println("Hello Spring!")
    }
}
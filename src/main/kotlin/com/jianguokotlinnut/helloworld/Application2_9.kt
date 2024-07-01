package com.jianguokotlinnut.helloworld

import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

/**
 * 类描述: 测试继承容器中bean的可见性和覆盖情况
 * @author 坚果
 * @date 2024/1/25 1:09
 */

class Application2_9 {
    //声明context上下文实现
    private var parentContext : ClassPathXmlApplicationContext = ClassPathXmlApplicationContext("parent-beans.xml")
    private var childContext : ClassPathXmlApplicationContext = ClassPathXmlApplicationContext(
        arrayOf("child-beans.xml")  ,true,parentContext)
    //初始化
    init {
        parentContext.id = "ParentContext"
        childContext.id = "ChildContext"
    }
    //关于容器继承的通用结论————和Java类的继承非常相似，可通过容器的setAllowBeanDefinitionOverriding()方法控制禁止覆盖。
    fun runTests(){
        /**
         * ParentContext can see parentHelloBean : true
         * ChildContext can see parentHelloBean : true
         * ParentContext can see childHelloBean : false
         * ChildContext can see childHelloBean : true
         * sayHello from ParentContext : Hello World! by PARENT
         * sayHello from ChildContext : Hello World! by CHILD
         */
        testVisibility(parentContext,"parentHelloBean")
        testVisibility(childContext,"parentHelloBean")
        testVisibility(parentContext,"childHelloBean")  //父上下文不能看到子上下文的bean。
        testVisibility(childContext,"childHelloBean")  //子上下文可以看到父上下文中定义的bean，反之不行。
        testOverridden(parentContext,"helloBean")
        testOverridden(childContext,"helloBean")  //子上下文中可以定义与父上下文同ID的bean，各自都能获取自己定义的bean。
    }
    private fun testVisibility(context:ApplicationContext,beanName:String){
        println("${context.id} can see $beanName : ${context.containsBean(beanName)}")
    }
    private fun testOverridden(context:ApplicationContext,beanName:String){
        println("sayHello from ${context.id} : ${context.getBean(beanName,HelloBean2_6::class.java).hello()}")
    }
}

fun main(args:Array<String>){
    Application2_9().runTests()
}
package com.jianguokotlinnut.helloworld

/**
 * 类描述: 容器的继承关系demo
 * Spring的容器之间也存在继承关系，子容器可以继承父容器中配置的组件。使用Spring MVC时就会涉及容器的继承。
 * @author 坚果
 * @date 2024/1/25 0:54
 */

class HelloBean2_6 {
    private lateinit var name : String //要注入的信息
    fun hello():String{
        return "Hello World! by $name"
    }
    fun setName(name : String){
        this.name = name
    }
}
package com.jianguokotlinnut.helloworld

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.core.env.Environment

/**
 * 类描述: PropertySource抽象加载属性值
 * @author 坚果
 * @date 2024/2/5 4:14
 */

//PropertySource：所有物来源
@Configuration
class PropertySourceHello {
    @Autowired
    private lateinit var environment : Environment
    fun hello(){
        println("foo.bar:${environment.getProperty("foo.bar")}")  //从环境变量中获取属性foo.bar
    }
    @Value("\${foo.bar:None}")
    private lateinit var value : String
    fun hello2(){
        println("foo.bar: $value")
    }
}
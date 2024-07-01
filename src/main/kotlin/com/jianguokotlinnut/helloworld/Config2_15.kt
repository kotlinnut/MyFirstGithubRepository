package com.jianguokotlinnut.helloworld

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * 类描述: 在Java配置类中指定Bean之间的依赖关系
 * @author 坚果
 * @date 2024/1/27 2:23
 */

@Configuration
class Config2_15 {
    //创建一个名为foo的Bean
    @Bean
    fun foo() : Foo{
        return Foo()
    }

    //通过参数foo，注入foo这个Bean
    @Bean
    fun bar(foo:Foo) : Bar{
        return Bar(foo)
    }

    //通过调用foo()，获得同一个Bean
    @Bean
    fun baz() : Baz{
        return Baz(foo())
    }

    inner class Foo
    inner class Bar(foo:Foo)
    inner class Baz(foo:Foo)
}
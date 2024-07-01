package com.jianguokotlinnut.helloworld

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
/**
 * 类名: 第一章1-1编写简单的REST服务
 * @author 坚果
 * @date 2024/1/24 2:44
 */
//第一章1-1编写简单的REST服务
//入口程序Application
@SpringBootApplication
//表示可以处理HTTP请求并返回JSON格式的响应
@RestController
class Application1_1{

	//编写简单的可执行的REST服务，处理/helloWorld的请求，并输出一段文本。
	@RequestMapping("/helloworld")
	fun helloworld() : String{
		return "Hello World! Bravo Spring!"
	}
}

fun main(args: Array<String>) {
	runApplication<Application1_1>(*args)
}

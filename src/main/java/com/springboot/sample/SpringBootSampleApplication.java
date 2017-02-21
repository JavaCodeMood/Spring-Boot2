package com.springboot.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSampleApplication {

	public static void main(String[] args) {
		// 启动SpringBoot
		SpringApplication.run(SpringBootSampleApplication.class, args);
	}
}

/*
 * 现在可以直接运行 SpringBootSampleApplication 的main方法，和执行普通java程序一样。 然后可以看到spring-boot
 * 内置server容器（默认为Tomcat），这一切spring-boot 都帮我们做好了。
 * 
 * 控制台输出内容 Started SpringBootSampleApplication in 7.358 seconds (JVM running for
 * 9.154) 表示服务已经启动。
 * 
 * 在浏览器输入我们3个请求便可看到结果。 
 * http://localhost:8080/hello 输出：Hello Spring-Boot
 * http://localhost:8080/hello/info?name=shanhy 输出：{“name”:”shanhy”}
 * http://localhost:8080/hello/list
 * 输出：[{“name”:”Shanhy-1”},{“name”:”Shanhy-2”},{“name”:”Shanhy-3”},{“name”:”
 * Shanhy-4”},{“name”:”Shanhy-5”}]
 */
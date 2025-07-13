package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot应用程序的入口类
 */
@SpringBootApplication
public class DemoApplication {

	/**
	 * 应用程序入口方法
	 * @param args 命令行参数
	 */
	public static void main(String[] args) {
		// 启动Spring应用上下文，自动配置并启动嵌入式服务器
		SpringApplication.run(DemoApplication.class, args);
	}

}
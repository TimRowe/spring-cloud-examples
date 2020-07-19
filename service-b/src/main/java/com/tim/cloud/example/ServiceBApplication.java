package com.tim.cloud.example;

import com.tim.cloud.example.service.AServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableFeignClients(basePackages = "com.tim.cloud.example.service")
public class ServiceBApplication {

	@Value("${server.port}")
	private int port;

	@Autowired
	private AServiceFeign aServiceFeign;

	public static void main(String[] args) {
		SpringApplication.run(ServiceBApplication.class, args);
	}

	@RequestMapping("/hi")
	public String hello() {
		return "hi, I am service b, my port=" + String.valueOf(port);
	}

	@RequestMapping("/callA")
	public String callA() {
		try {
			return aServiceFeign.hi();
		}
		catch (Exception e){
			return "Exception:" + e.getMessage();
		}

	}

}

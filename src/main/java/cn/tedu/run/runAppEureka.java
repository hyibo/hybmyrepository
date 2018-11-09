package cn.tedu.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class runAppEureka {

	public static void main(String[] args) {

		SpringApplication.run(runAppEureka.class, args);
	}

}

package com.wlz.cont;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages ={ "com.wlz.cont.user", "com.wlz.cont.config"})
@MapperScan("com.wlz.cont.dao")
public class ContApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContApplication.class, args);
	}

}

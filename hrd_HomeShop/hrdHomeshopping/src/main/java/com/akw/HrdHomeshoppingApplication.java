package com.akw;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HrdHomeshoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrdHomeshoppingApplication.class, args);
	}

	private static final Logger logger = LoggerFactory.getLogger(HrdHomeshoppingApplication.class);
	
	@Bean
	CommandLineRunner testDBCon(DataSource dataSource) {
		return arg -> {
			try {
				dataSource.getConnection().close();
				logger.info("====== 연결 성공 ======");
			} catch (Exception e) {
				logger.error("ㅠㅠㅠㅠㅠㅠ 연결 실패 ㅠㅠㅠㅠㅠㅠ", e);
			}
		};
	}
}

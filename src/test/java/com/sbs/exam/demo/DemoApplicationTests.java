package com.sbs.exam.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.Data;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

}

@Data
class Article { 
	private int id;
}
package com.nag;

import com.nag.tp.Calculator;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JunitPracticeApplicationTests {


	private  Calculator c= new Calculator();

	@Test
	void contextLoads() {
	}

	@BeforeAll
	static void String(){
		System.out.println("Testing is Begin");
	}

	@BeforeEach
	void testNumber(){
		System.out.println(" new Test");
	}
	@AfterAll
	static void testEnd(){
		System.out.println("All Test Ended");
	}

	@AfterEach
	void endTest(){
		System.out.println("test ended");
	}
	@Test
	@DisplayName("Sum Test Case")
	void testSum(){
		int actual = c.add(10,20);
		int expected= 30;

		assertThat(actual).isEqualTo(expected);
	}

	@Test
	@DisplayName("Multiply Test Case")
	void testMul(){
		assertEquals(100, c.mul(5,10));
	}

}

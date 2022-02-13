package com.example.review.funtionalinterface;

import org.junit.jupiter.api.Test;

import com.example.review.funtionalinterface.code.FunctionalTest;
import com.example.review.funtionalinterface.code.FunctionalTest02;
import com.example.review.funtionalinterface.code.FunctionalTest03;
import com.example.review.funtionalinterface.code.TestObject;

public class FunctionalInterfaceTest {

	@Test
	void test01() {
		FunctionalTest test01 = ()->{System.out.println("abcd");};
		test01.test();
	}
	
	@Test
	void test02() {
		
		FunctionalTest02 test02 = ()->{
			System.out.println("123456");
			return TestObject.builder()
					.age(10)
					.name("test001")
					.build();
		};
		
		System.out.println("********************************");
		System.out.println(test02.testObject());
		System.out.println("********************************");
	}
	
	@Test
	void test03() {

		FunctionalTest03 test03 = (parameterName, parameterAge)->{
			System.out.println("parameterName : " + parameterName);
			System.out.println("parameterAge : " + parameterAge);
			return new TestObject(parameterName, parameterAge);
		};

		System.out.println("************************************************");
		System.out.println(test03.testObject("FunctionalInterfaceTest", 30));
		System.out.println("************************************************");

	}
}






package com.example.review.reflection;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReflectionTest {

	@Test
	void reflection0() {
		
		Hello target = new Hello();

		// 공통 로직1 시작
		log.info("start");
		String result1 = target.callA();
		log.info("result1={}", result1);
		// 공통 로직1 끝
		
		// 공통 로직2 시작
		log.info("start");
		String result2 = target.callB();
		log.info("result2={}", result2);
		// 공통 로직2 끝
	}
	
	@Test
	void reflection1() throws Exception{
		Class<?> classHello = Class.forName("com.example.review.reflection.ReflectionTest$Hello");
		
		Hello target = new Hello();
		
		Method methodCallA = classHello.getMethod("callA");
		Object result1 = methodCallA.invoke(target);
		log.info("result1={}",result1);
		
		Method methodCallB = classHello.getMethod("callB");
		Object result2 = methodCallB.invoke(target);
		log.info("result2={}", result2);
	}
	
	
	@Test
	void reflection2() throws Exception{
		Class<?> classHello = Class.forName("com.example.review.reflection.ReflectionTest$Hello");
		Hello target = new Hello();
		
		Method methodCallA = classHello.getMethod("callA");
		dynamicCall(methodCallA, target);
		
		Method methodCallB = classHello.getMethod("callB");
		dynamicCall(methodCallB, target);
	}
	
	private void dynamicCall(Method method, Object target) throws Exception{
		log.info("start");
		Object result = method.invoke(target);
		log.info("result={}", result);
	}
	
	
	@Slf4j
	static class Hello{
		public String callA() {
			log.info("callA");
			return "A";
		}
		public String callB() {
			log.info("callB");
			return "B";
		}
	}
	
}

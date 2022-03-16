package com.example.review.jdkdynamicproxy;

import java.lang.reflect.Proxy;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JdkDynhamicProxyTest {


	@Test
	void dynamicA() {
		AInterface target = new AImpl();
		TimeInvocationHandler handler = new TimeInvocationHandler(target);
		AInterface proxy = (AInterface) Proxy.newProxyInstance(AInterface.class.getClassLoader(), new Class[] {AInterface.class}, handler);
		
		String result = proxy.call();
		
		log.info("targetClass={}", target.getClass());
		log.info("proxyClass={}", proxy.getClass());
		log.info("result={}", result);
	}
	
	
	@Test
	void dynamicB() {
		BInterface target = new BImpl();
		TimeInvocationHandler handler = new TimeInvocationHandler(target);
		BInterface proxy = (BInterface) Proxy.newProxyInstance(BInterface.class.getClassLoader(), new Class[] {BInterface.class}, handler);
		
		String result = proxy.call();

		log.info("targetClass={}", target.getClass());
		log.info("proxyClass={}", proxy.getClass());
		log.info("result={}", result);
	}
	
}





























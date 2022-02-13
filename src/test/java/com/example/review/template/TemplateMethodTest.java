package com.example.review.template;

import org.junit.jupiter.api.Test;

import com.example.review.template.code.AbstractTemplate;
import com.example.review.template.code.SubClassLogic1;
import com.example.review.template.code.SubClassLogic2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TemplateMethodTest {


	@Test
	void templateMethod_1() {
		AbstractTemplate template1 = new SubClassLogic1();
		template1.execute();
		
		AbstractTemplate template2 = new SubClassLogic2();
		template2.execute();
	}
	
	@Test
	void abstract_Internal_Class() {

		AbstractTemplate template1 = new AbstractTemplate() {
			@Override
			protected void call() {
				log.info("비즈니스 로직1 실행");
			}
		};
		
		
		
	}
	
}






















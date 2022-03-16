package com.example.review.callback.code.v2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeLogTemplateV2 {


	public void execute(CallbackV2 callback) {
		
		long startTime = System.currentTimeMillis();
		
		int a = 10;
		int b = 20;
		
		// 비즈니스 로직 실행
		callback.call(a, b);
		
		// 비즈니스 로직 종료
		long endTime = System.currentTimeMillis();
		long result = endTime - startTime;
		
		log.info("resultTime={}", result);
	}
	
	
}





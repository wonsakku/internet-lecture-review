package com.example.review.strategy.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Context01 {

	private Strategy01 strategy;

	public Context01(Strategy01 strategy) {
		this.strategy = strategy;
	}

	
	public void execute(String code) {
		
		log.info("inserted code={}", code);
		int tranformedCode = strategy.call(code);
		log.info("after tranform={}", tranformedCode);
	}
	
}







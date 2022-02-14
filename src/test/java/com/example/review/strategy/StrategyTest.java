package com.example.review.strategy;

import org.junit.jupiter.api.Test;

import com.example.review.strategy.code.Context01;
import com.example.review.strategy.code.Strategy01Impl01;
import com.example.review.strategy.code.Strategy01Impl02;

public class StrategyTest {

	@Test
	void strategyTest01() {
		Context01 context01 = new Context01(new Strategy01Impl01());
		context01.execute("avded");
		
		System.out.println();
		
		Context01 context02 = new Context01(new Strategy01Impl02());
		context02.execute("adced");
	}
}

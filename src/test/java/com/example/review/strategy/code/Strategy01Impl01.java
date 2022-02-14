package com.example.review.strategy.code;

public class Strategy01Impl01 implements Strategy01{

	@Override
	public int call(String code) {
		char[] splitedCode = code.toCharArray();
		int sum = 0;
		for(char chr : splitedCode) {
			sum += (int) chr;
		}
		return sum;
	}

	
}

package com.example.review.callback;

import org.junit.jupiter.api.Test;

import com.example.review.callback.code.v1.TimeLogTemplate;
import com.example.review.callback.code.v2.CallbackV2;
import com.example.review.callback.code.v2.TimeLogTemplateV2;
import com.example.review.callback.code.v3.CallbackDBConnect;
import com.example.review.callback.code.v3.MariaDBConnector;
import com.example.review.callback.code.v3.PostgresDBConnector;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TemplateCallbackTest {

	
	@Test
	void callback() {
		TimeLogTemplate template = new TimeLogTemplate();
		template.execute(()->log.info("비즈니스 로직1 실행"));
	}
	
	
	@Test
	void callbackV2() {
		TimeLogTemplateV2 timeLogTemplateV2 = new TimeLogTemplateV2();
		timeLogTemplateV2.execute((num1, num2)->log.info(num1*num2 + ""));
	}

	
	@Test
	void callbackV3() {
		
		CallbackDBConnect connector = new CallbackDBConnect();
		connector.connect(new PostgresDBConnector());
	}
	
}
















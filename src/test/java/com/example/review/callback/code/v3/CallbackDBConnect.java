package com.example.review.callback.code.v3;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CallbackDBConnect {

	public void connect(DBConnector dbConnector) {
		
		long startTime = System.currentTimeMillis();
		
		System.out.println("DB의 IP, PORT, USERNAME, PASSWORD 정보를 가져온다.");
		dbConnector.dbConnect();
		
		long endTime = System.currentTimeMillis();
		long resultTime = endTime - startTime;
		log.info("DB Connection Time={}", resultTime);
		
	};
}

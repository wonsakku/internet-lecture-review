package com.example.review.callback.code.v3;

public class MysqlDBConnector implements DBConnector{

	@Override
	public void dbConnect() {
		System.out.println("MySQL에 연결을 한다.");
	}

	
}

package com.example.review.callback.code.v3;

public class PostgresDBConnector implements DBConnector{

	@Override
	public void dbConnect() {
		System.out.println("PostgreSQL에 연결을 한다.");
	}

	
}

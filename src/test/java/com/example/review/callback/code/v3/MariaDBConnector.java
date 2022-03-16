package com.example.review.callback.code.v3;

public class MariaDBConnector implements DBConnector{

	@Override
	public void dbConnect() {
		System.out.println("MariaDB에 연결을 한다.");
	}

	
}

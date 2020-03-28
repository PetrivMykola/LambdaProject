package com.simple.lambda;

import com.simple.common.CommonService;

public class FunctionA {
	
	public String handleRequest() {
		
		System.out.println("@ Inside function A");
		return new CommonService().serviceA();
	}

}

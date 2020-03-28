package com.simple.lambda;

import com.simple.common.CommonService;

public class FunctionB {
	
	public String handleRequest() {
		
		System.out.println("@ Inside function B");
		return new CommonService().serviceB();
	}

}

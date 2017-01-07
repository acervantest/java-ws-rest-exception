package com.template.exception;

public class SomeBusinessException extends RuntimeException {

	private static final long serialVersionUID = -7823982510520056001L;

	public  SomeBusinessException(String s){
		super(s);
	}
}

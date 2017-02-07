package com.Himanshu;

public class Request {

	private String EAI;

	public String getEAI() {
		return EAI;
	}

	public void setEAI(String eAI) {
		EAI = eAI;
	}

	@Override
	public String toString() {
		return "Request [EAI=" + EAI + "]";
	}

	public Request(String eAI) {
		super();
		EAI = eAI;
	}
	
	
}

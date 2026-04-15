package com.nisha.Customexceptions;

public class RecordNotFoundException extends RuntimeException{

	public RecordNotFoundException(String msg) {
		super(msg);
	}
	
}

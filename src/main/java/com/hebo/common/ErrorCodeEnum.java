package com.hebo.common;

public enum ErrorCodeEnum {
	
	SUCCESS(1000, "SUCCESS"),
	PARAMERROR(9998, "参数错误"),
	IDERROR(9998, "id不能为12"),
	FAIL(9999, "SYSTEM ERROR")
	;
	
	private int code;
	private String message;

	private ErrorCodeEnum(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

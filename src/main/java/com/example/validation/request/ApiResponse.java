package com.example.validation.request;

public class ApiResponse {
	private boolean error;
	private String message;
	private Object data;

	public ApiResponse(Object data) {
		this.data = data;
	}

	public ApiResponse(boolean error, String message, Object data) {
		this.error = error;
		this.message = message;
		this.data = data;
	}

	public ApiResponse() {
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}

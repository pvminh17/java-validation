package com.example.validation.controller;

import com.example.validation.request.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class AdviceController {
	@ExceptionHandler({Exception.class})
	public ResponseEntity<Object> handleAccessDeniedException(
			Exception ex, WebRequest request) {
		System.out.println(ex);
		return ResponseEntity.ok(ex.getClass() + " \n" + ex.getLocalizedMessage());
	}

	@ExceptionHandler({MethodArgumentNotValidException.class})
	public ResponseEntity<Object> MethodArgumentNotValidException(
			MethodArgumentNotValidException ex, WebRequest request) {
		System.out.println(ex.getMessage());
		return ResponseEntity.ok(new ApiResponse(true, ex.getBindingResult().getAllErrors().get(0).getDefaultMessage(), null));
	}
}

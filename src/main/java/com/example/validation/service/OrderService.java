package com.example.validation.service;

import com.example.validation.request.OrderRequest;
import org.springframework.stereotype.Service;
import org.springframework.validation.Validator;

@Service
public class OrderService {

	public OrderRequest createOder(OrderRequest request) {
		return request;
	}

	public boolean check(Double d) {
		return d.equals(2D);
	}
}

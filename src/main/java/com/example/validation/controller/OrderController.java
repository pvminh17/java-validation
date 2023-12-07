package com.example.validation.controller;

import com.example.validation.request.ApiResponse;
import com.example.validation.request.OrderRequest;
import com.example.validation.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.Size;

@RestController
@RequestMapping("order")
public class OrderController {
	@Autowired
	OrderService orderService;

	@PostMapping("create")
	public Object createOrder(@Valid @RequestBody OrderRequest request) {
		return new ApiResponse(orderService.createOder(request));
	}
}

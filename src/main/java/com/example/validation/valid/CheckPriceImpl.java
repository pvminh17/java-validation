package com.example.validation.valid;

import com.example.validation.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;


public class CheckPriceImpl implements ConstraintValidator<CheckPrice, Double> {
	@Autowired
	OrderService orderService;

	private CheckPrice checkPrice;


	@Override
	public void initialize(CheckPrice constraintAnnotation) {
		ConstraintValidator.super.initialize(constraintAnnotation);
		System.out.println(constraintAnnotation);
		this.checkPrice = constraintAnnotation;
	}

	@Override
	public boolean isValid(Double value, ConstraintValidatorContext context) {
		System.out.println(this);
		return orderService.check(value);

	}
}

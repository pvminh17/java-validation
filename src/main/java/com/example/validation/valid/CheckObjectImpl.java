package com.example.validation.valid;

import com.example.validation.request.OrderRequest;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Field;

public class CheckObjectImpl implements ConstraintValidator<CheckCompanyObject, OrderRequest> {
	private CheckCompanyObject annotation;

	@Override
	public void initialize(CheckCompanyObject constraintAnnotation) {
		ConstraintValidator.super.initialize(constraintAnnotation);
		this.annotation = constraintAnnotation;
	}

	@Override
	public boolean isValid(OrderRequest value, ConstraintValidatorContext context) {
		return false;
	}

//	@Override
//	public boolean isValid(Object value, ConstraintValidatorContext context) {
//		try {
//			Field field = value.getClass().getDeclaredField(annotation.onField()[0]);
//			//field.setAccessible(true);
//			Object c = field.get(value);
//		} catch (NoSuchFieldException e) {
//			throw new RuntimeException(e);
//		} catch (IllegalAccessException e) {
//			throw new RuntimeException(e);
//		}
//		return false;
//	}
}

package com.example.validation.valid;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD, METHOD, PARAMETER, ANNOTATION_TYPE, TYPE_USE})
@Retention(RUNTIME)
@Constraint(validatedBy = CheckObjectImpl.class)
@Documented
public @interface CheckCompanyObject {
	String message() default "{message}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String[] onField() default {"companyID"};
}

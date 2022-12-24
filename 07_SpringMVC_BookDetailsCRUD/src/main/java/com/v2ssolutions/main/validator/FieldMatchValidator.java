package com.v2ssolutions.main.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.BeanWrapperImpl;
import org.yaml.snakeyaml.introspector.PropertyUtils;

public class FieldMatchValidator implements ConstraintValidator<FieldMatch, Object> {

	private String firstFieldName;
	private String secondFieldName;

	public void initialize(final FieldMatch constraintAnnotation) {
		this.firstFieldName = constraintAnnotation.first();
		this.secondFieldName = constraintAnnotation.second();
	}

	public boolean isValid(final Object value, final ConstraintValidatorContext context) {
		System.out.println("isValid");
		Object fieldValue = new BeanWrapperImpl(value).getPropertyValue(firstFieldName);
		Object fieldMatchValue = new BeanWrapperImpl(value).getPropertyValue(secondFieldName);

		if (fieldValue != null) {
			System.out.println("if");
			boolean result = fieldValue.equals(fieldMatchValue);
			System.out.println(result);
			return result;
		} else {
			System.out.println("else");
			return fieldMatchValue == null;
		}

	}
}

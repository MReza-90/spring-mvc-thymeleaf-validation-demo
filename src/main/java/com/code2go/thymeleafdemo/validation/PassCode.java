package com.code2go.thymeleafdemo.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = PassCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PassCode {

    //define default pass code
    public String value() default "TX";

    //define default error message
    public String message() default "It must start with TX";


    // define default groups
    public Class<?>[]groups() default {};

    //define default payloads
    public Class<? extends Payload>[] payload() default{};

}
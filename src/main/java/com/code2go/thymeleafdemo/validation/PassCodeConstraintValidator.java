package com.code2go.thymeleafdemo.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PassCodeConstraintValidator implements ConstraintValidator<PassCode, String> {

    private String passPrefix;

    @Override
    public void initialize(PassCode passCode) {
        passPrefix=passCode.value();
    }

    @Override
    public boolean isValid(String pass, ConstraintValidatorContext constraintValidatorContext) {
         boolean result ;

         if(pass!=null){
             result=pass.startsWith(passPrefix);
         }else{
             result=true;
         }
         return result;
    }
}

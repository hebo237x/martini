package com.hebo.common;

import org.hibernate.validator.HibernateValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 * Created by hebo on 2018/5/25.
 */
@Configuration
public class ValidatorConfig {

    @Bean
    public Validator validator(){
        ValidatorFactory validatorFactory  = Validation.byProvider(HibernateValidator.class)
                .configure().failFast(true).buildValidatorFactory();
        return validatorFactory.getValidator();
    }
}

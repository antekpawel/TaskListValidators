package com.kodilla.tasklistvalidators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * User: Z6PWA
 * Date: 26.10.2023
 */
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DateMinValidator.class)
public @interface DateMin {
  String message() default "Earlier date then expected";
  Class<?>[] groups() default {};
  Class<? extends Payload>[] payload() default {};

  String value() default "2020-01-01";
}

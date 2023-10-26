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
@Constraint(validatedBy = RangeValidator.class)
public @interface Range
{
  String message() default "Out of range";
  Class<?>[] groups() default {};
  Class<? extends Payload>[] payload() default {};

  int minVal() default 0;
  int maxVal() default 5;
}

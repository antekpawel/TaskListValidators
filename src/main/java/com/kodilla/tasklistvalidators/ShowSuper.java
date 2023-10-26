package com.kodilla.tasklistvalidators;

import javax.validation.Constraint;
import java.lang.annotation.*;

/**
 * User: Z6PWA
 * Date: 26.10.2023
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DateMinValidator.class)
public @interface ShowSuper
{
  String separator() default " -> ";
}

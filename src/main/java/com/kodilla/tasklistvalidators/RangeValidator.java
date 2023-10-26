package com.kodilla.tasklistvalidators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

/**
 * User: Z6PWA
 * Date: 26.10.2023
 */
public class RangeValidator implements ConstraintValidator<Range, Integer>
{
  private int minVal;
  private int maxVal;

  public void initialize(Range constraintAnnotation) {
    minVal = constraintAnnotation.minVal();
    maxVal = constraintAnnotation.maxVal();
  }
  @Override
  public boolean isValid(Integer value, ConstraintValidatorContext context) {
    if (value < minVal || value > maxVal)
      return false;
    return true;
  }
}

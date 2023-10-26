package com.kodilla.tasklistvalidators;


import lombok.Value;

import javax.validation.constraints.*;
import java.time.LocalDate;

/**
 * User: Z6PWA
 * Date: 25.10.2023
 */
@Value
public class TaskDto
{
  @NotNull
  @DateMin("2021-01-01")
  LocalDate when;
  @NotNull
  String title;
  @Range(minVal = 1, maxVal = 5)
  int priority;
}

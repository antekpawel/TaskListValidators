package com.kodilla.tasklistvalidators;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Z6PWA
 * Date: 25.10.2023
 */
@ShowSuper(separator = " =>> ")
public class TaskRepository
{
  public static List<TaskDto> getRepository() {
    List<TaskDto> dtos = new ArrayList<>();
    dtos.add(new TaskDto(LocalDate.of(2022, 3, 10), "Wyprowadź psa na spacer",  4));
    dtos.add(new TaskDto(LocalDate.of(2022, 3, 10), "Wyprowadź kota na spacer", 2));
    dtos.add(new TaskDto(LocalDate.of(2022, 4, 11), "Zrób pranie", 3));
    dtos.add(new TaskDto(LocalDate.of(2022, 4, 18), "Zapłać czynsz", 2));
    return dtos;
  }
}

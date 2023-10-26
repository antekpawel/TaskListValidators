package com.kodilla.tasklistvalidators;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * User: Z6PWA
 * Date: 26.10.2023
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/annotations")
public class AnnotationController {
  @GetMapping("/")
  public ResponseEntity<String> getFiltered(@RequestParam String fullClassName) {
    try {
      Class<?> clazz = AnnotationController.class
        .getClassLoader()
        .loadClass(fullClassName);

      String response = clazz.getCanonicalName();
      if (clazz.isAnnotationPresent(ShowSuper.class)) {
        ShowSuper annotation = clazz.getAnnotation(ShowSuper.class);
        response = clazz.getGenericSuperclass()
          .getTypeName() + annotation.separator() + response;
      }

      return new ResponseEntity<>(response, HttpStatus.OK);
    } catch (ClassNotFoundException e) {
      return new ResponseEntity<>(fullClassName + " is unknown.", HttpStatus.BAD_REQUEST);
    }

  }

}

package io.javabrains.springbootquickstart.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DATA-DOG team
 */
@RestController
public class HelloController {

  @RequestMapping("/hello")
  public String sayHi() {
    return "Hi";
  }
}

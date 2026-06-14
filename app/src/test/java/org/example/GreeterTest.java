package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GreeterTest {
  @Test
  void greetingIsHelloWorld() {
    Greeter greeter = new Greeter();
    assertEquals("Hello World!", greeter.getGreeting());
  }
}

package uk.co.analoguesoftware.springjsonlogging.demo;

import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;

class DemoControllerTest {

  @Test
  void shouldSayHello() {
    StepVerifier.create(new DemoController().sayHello("Steve"))
        .expectNext("Hello Steve!")
        .verifyComplete();
  }
}
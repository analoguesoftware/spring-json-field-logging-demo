package uk.co.analoguesoftware.springjsonlogging.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/hello")
public class DemoController {
  private static final Logger log = LoggerFactory.getLogger(DemoController.class);

  @GetMapping("/{name}")
  public Mono<String> sayHello(@PathVariable String name) {
    log.atInfo().setMessage("Saying hello").addKeyValue("name", name).log();
    return Mono.just("Hello " + name + "!");
  }
}

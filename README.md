# spring-json-field-logging-demo

A demo of adding extra fields to JSON logging in Spring. It's not really specific to Spring, the
main technique is applicable to any app that uses Logback.

uk.co.analoguesoftware.springjsonlogging.demo.DemoController.sayHello adds an extra `"name"` field to the JSON log output like this:
```java
log.atInfo().setMessage("Saying hello").addKeyValue("name", name).log();
```

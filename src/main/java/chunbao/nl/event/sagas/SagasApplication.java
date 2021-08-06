package chunbao.nl.event.sagas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(
    basePackages = {
      "chunbao.nl.event.user",
      "chunbao.nl.event.saga",
      "chunbao.nl.event.event"
    }) // scan h2 entity
@ComponentScan(basePackages = {"chunbao.nl.event.dao"}) // external beans
public class SagasApplication {

  public static void main(String[] args) {
    SpringApplication.run(SagasApplication.class, args);
  }
}

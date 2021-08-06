package chunbao.nl.event.sagas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("chunbao.nl.event.module") // scan h2 entity
@ComponentScan("chunbao.nl.event.dao") // scan repo beans
public class SagasApplication {

  public static void main(String[] args) {
    SpringApplication.run(SagasApplication.class, args);
  }
}

package chunbao.nl.event.sagas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("chunbao.nl.event.module") // scan h2 entity
public class SagasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SagasApplication.class, args);
	}

}

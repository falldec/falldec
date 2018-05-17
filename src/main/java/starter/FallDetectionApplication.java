package starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import app.configuration.SwaggerConfiguration;
import authorization.api.AuthController;
import example.api.entities.Score;
import example.api.service.ScoreRepository;

@SpringBootApplication
@ComponentScan(basePackageClasses = {AuthController.class, SwaggerConfiguration.class}, basePackages = {"example"})
@EntityScan(basePackageClasses = Score.class)
@EnableJpaRepositories(basePackageClasses = {ScoreRepository.class})
public class FallDetectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(FallDetectionApplication.class, args);
    }

}

package app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(excludeSelectors())
                .paths(PathSelectors.any())
                .build();
    }

    private Predicate<RequestHandler> excludeSelectors() {
        return Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot"));
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Fall detector API")
                .description("API na potrzeby projektu wykrywania upadków przez czujniki nacisku umieszczone w podeszwie buta.")
                .contact(apiContact())
                .version("1.0")
                .build();
    }

    private Contact apiContact() {
        return new Contact("EE PW (Fall detector)", "www.ee.pw.edu.pl", "zawadzp4@ee.pw.edu.pl");
    }

}

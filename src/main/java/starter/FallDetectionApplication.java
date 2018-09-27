package starter;

import app.configuration.SwaggerConfiguration;
import authorization.api.AuthController;
import example.api.entities.Score;
import example.api.service.ScoreRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.context.ServletContextAware;

import javax.faces.webapp.FacesServlet;
import javax.servlet.ServletContext;

@SpringBootApplication
@ComponentScan(basePackageClasses = {AuthController.class, SwaggerConfiguration.class},
        basePackages = {"example", "fall_detection_data"})
@EntityScan(basePackageClasses = Score.class)
@EnableJpaRepositories(basePackageClasses = {ScoreRepository.class})
public class FallDetectionApplication implements ServletContextAware {

    public static void main(String[] args) {
        SpringApplication.run(FallDetectionApplication.class, args);
    }

    /*
     * DOWNLOADED FROM:
     * https://github.com/xtremebiker/jsf-spring-boot/blob/master/src/main/java/org/xtremebiker/jsfspring/JsfSpringBootApplication.java
     */

    @Bean
    public ServletRegistrationBean<FacesServlet> servletRegistrationBean() {
        ServletRegistrationBean<FacesServlet> servletRegistrationBean = new ServletRegistrationBean<>(
                new FacesServlet(), "*.xhtml");
        servletRegistrationBean.setLoadOnStartup(1);
        return servletRegistrationBean;
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        servletContext.setInitParameter("com.sun.faces.forceLoadConfiguration", Boolean.TRUE.toString());
        servletContext.setInitParameter("javax.faces.FACELETS_SKIP_COMMENTS", "true");
        servletContext.setInitParameter("primefaces.FONT_AWESOME", "true");
    }
}

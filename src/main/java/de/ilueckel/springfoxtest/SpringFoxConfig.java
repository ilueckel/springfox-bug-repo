package de.ilueckel.springfoxtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Created by Igor Lückel on 16.10.2020.
 */
@Configuration
public class SpringFoxConfig {

  @Bean
  public Docket apiDocketSwagger() {
    return new Docket(DocumentationType.SWAGGER_2)
            .groupName("DocumentationType.SWAGGER_2")
            .select()
            .paths(PathSelectors.any())
            .build();
  }

  @Bean
  public Docket apiDocketOpenApi() {
    return new Docket(DocumentationType.OAS_30)
            .groupName("DocumentationType.OAS_30")
            .select()
            .paths(PathSelectors.any())
            .build();
  }

}

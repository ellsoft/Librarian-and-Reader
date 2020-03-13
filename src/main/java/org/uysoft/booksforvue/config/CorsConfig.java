package org.uysoft.booksforvue.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registration){
        registration.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET","POST","HEAD","PUT","DELETE","OPTION")
                .allowCredentials(true)
                .maxAge(3600)
                .allowedHeaders("*");
    }
}

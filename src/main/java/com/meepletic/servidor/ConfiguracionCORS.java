package com.meepletic.servidor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;



@Configuration
@EnableWebMvc
public class ConfiguracionCORS extends WebMvcConfigurerAdapter {

    /**
     * Soluciona el error del cliente de denegación
     * de servicio por "Access-Control-Allow-Origin".
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }
}

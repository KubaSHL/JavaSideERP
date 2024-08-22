package com.PortfolioProject.ERPFullstackApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    @Bean
    public ClassLoaderTemplateResolver yourTemplateResolver() {
        ClassLoaderTemplateResolver configure = new ClassLoaderTemplateResolver();
        configure.setSuffix(".html");
        configure.setTemplateMode(TemplateMode.HTML);
        configure.setCharacterEncoding("UTF-8");
        configure.setOrder(0);
        configure.setCheckExistence(true);
        return configure;
    }

}

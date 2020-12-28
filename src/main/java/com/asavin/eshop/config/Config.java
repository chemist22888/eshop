package com.asavin.eshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import org.springframework.web.servlet.view.xml.MappingJackson2XmlView;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Config {
    @Bean
    public ViewResolver contentNegotiatingViewResolver() {
        ContentNegotiatingViewResolver resolver =
                new ContentNegotiatingViewResolver();

        List<View> views = new ArrayList<>();
        views.add(new MappingJackson2XmlView());
        views.add(new MappingJackson2JsonView());//by modifing it,you can use any format

        resolver.setDefaultViews(views);
        return resolver;
    }
}

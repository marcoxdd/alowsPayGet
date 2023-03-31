package br.com.payget.config;

import org.keycloak.adapters.springsecurity.client.KeycloakClientRequestFactory;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.security.web.session.HttpSessionEventPublisher;

public class SpringSecurityAdapter {
    @Bean
    public ServletListenerRegistrationBean<HttpSessionEventPublisher> httpSessionEventPublisher() {
        return new ServletListenerRegistrationBean<HttpSessionEventPublisher>(new HttpSessionEventPublisher());
    }

    @Bean
    public KeycloakClientRequestFactory keycloakClientRequestFactory(){
        return new KeycloakClientRequestFactory();
    }
}

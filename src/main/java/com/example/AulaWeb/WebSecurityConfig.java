package com.example.AulaWeb;

import org.springframework.boot.autoconfigure.cassandra.CassandraProperties.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfiguration{


    //FIXME: #### após os testes, remover o mapeamento new-user tanto da controller como das permissoes abaixo ####
    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(authorize  -> authorize  
            .requestMatchers("/", "/register").permitAll());
            // .formLogin((form) -> form
            // .loginPage("/login")
            // .permitAll())
            // .logout((logout)-> logout.permitAll());
        return http.build();
    }
}

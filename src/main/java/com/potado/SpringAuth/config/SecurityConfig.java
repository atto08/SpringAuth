package com.potado.SpringAuth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig {

    @Bean // passwordEncoder 대한 빈 등록!
    public PasswordEncoder passwordEncoder() { // DI 이전에 스프링 애플리케이션 컨테스트에 정의 해야함.
        return new BCryptPasswordEncoder();
    }
}

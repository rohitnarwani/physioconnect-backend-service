package com.physioconnect.api.rest.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeHttpRequests(
				(requests) -> requests.antMatchers("/", "/login/oauth2/*","/login", "/oauth/**").permitAll().anyRequest().authenticated())
				.formLogin((form) -> form.loginPage("/login").permitAll()).logout((logout) -> logout.permitAll());

		return http.build();
	}
}

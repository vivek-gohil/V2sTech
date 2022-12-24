package com.v2ssolutions.main.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		System.out.println("filterChain");
		//http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
		http.authorizeHttpRequests()
			.antMatchers("/addnewbook").hasRole("ADMIN")
			.antMatchers("/deletebook").hasRole("ADMIN")
			.antMatchers("/update").hasAnyRole("USER", "ADMIN")
			.antMatchers("/user").permitAll()
			.antMatchers("/").permitAll().and().formLogin();
		return http.build();

	}

	@Bean
	public InMemoryUserDetailsManager userDetailsService(PasswordEncoder encoder) {
		System.out.println("userDetailsService");
		UserDetails user = User.withUsername("user").password(encoder.encode("password")).roles("USER").build();

		UserDetails admin = User.withUsername("admin").password(encoder.encode("admin")).roles("ADMIN").build();

		return new InMemoryUserDetailsManager(user, admin);
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		System.out.println("passwordEncoder");
		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
		return encoder;
	}
}

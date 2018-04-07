package com.hammertheatre.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration // Registers this class as a Spring Bean
@EnableWebSecurity //Enables Spring Security support
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.
		authorizeRequests()
			.antMatchers("/", "/form")
			.permitAll()	// Permit all users to access the URLs listed in .antMatchers()
			.anyRequest()
			.authenticated() // Any request to URL not mentioned previously must be authenticated
			.and()
		.formLogin()
			.loginPage("/login")
			.defaultSuccessUrl("/view-tickets")
			.permitAll(); // Allows any user to access login page
	}
}

package com.hammertheatre.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
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
			.antMatchers("/", "/form", "/api")
			.permitAll()	// Permit all users to access the URLs listed in .antMatchers()
		.anyRequest()
			.authenticated() // Any request to URL not mentioned previously must be authenticated
			.and()
		.formLogin()
			.loginPage("/login")
			.defaultSuccessUrl("/view-tickets")
			.permitAll(); // Allows any user to access login page
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		// Configure global user/password
		auth
			.inMemoryAuthentication()
			.withUser("Test")
			.password("Password123")
			.roles("USER");
	}
}

package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@SpringBootApplication
@EnableWebSecurity
public class UserservicesecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserservicesecurityApplication.class, args);
	}

	
	@Bean 
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
	{ 
		http.authorizeHttpRequests()
				.antMatchers(HttpMethod.GET, "/home/**").hasAnyRole("USER","ADMIN")
				.antMatchers(HttpMethod.GET,"/home/user/**").hasRole("USER")
				.antMatchers(HttpMethod.POST,"/adduser").hasRole("USER")
				.anyRequest()
				.authenticated()
				.and()
			    .httpBasic()
			    .and()
			    .sessionManagement().disable();
				
		return http.build();
	}
	
	
	@Bean 
	public UserDetailsService getUserDetails()
	{
		UserDetails user1=User.builder().username("user").password("{noop}password123").roles("USER").build();
		UserDetails user2=User.builder().username("admin").password("{noop}iamadmin").roles("ADMIN").build();
		return new InMemoryUserDetailsManager(user1,user2);
	}
	
	
}

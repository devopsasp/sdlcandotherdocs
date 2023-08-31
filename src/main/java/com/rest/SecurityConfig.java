package com.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity

public class SecurityConfig  extends WebSecurityConfigurerAdapter{

	@Autowired
	UserRepository repository;
	@Override
	public void configure(HttpSecurity http) throws Exception 
	{
		
	HttpSecurity http1=	http.authorizeHttpRequests((requests)->requests
				.requestMatchers(new AntPathRequestMatcher("/home/**")).
				permitAll().
				anyRequest().
				authenticated())
		        . csrf(AbstractHttpConfigurer::disable);
		
 
	/*	try {
			http.authorizeHttpRequests()
			.antMatchers(HttpMethod.GET, "/home/**").hasAnyRole("USER","ADMIN")
			.antMatchers(HttpMethod.GET,"/home/user/**").hasRole("USER")
			.antMatchers(HttpMethod.POST,"/home").hasRole("USER")
			.anyRequest()
			.authenticated()
			.and()
			.csrf(AbstractHttpConfigurer::disable);
			
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		//http.authorizeHttpRequests().antMatchers(HttpMethod.POST,"/auth").permitAll();
		

	}
	
	@Override 
	public void configure(AuthenticationManagerBuilder builder) throws Exception 
	{
	  /*try {
		builder.inMemoryAuthentication().withUser("admin").password("{noop}password").authorities(new SimpleGrantedAuthority("USER"));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
		builder.userDetailsService((user)->repository.findById(user).get());
	}

	
	@Bean
	public AuthenticationManager getAuth()  
	{
		try {
			return super.authenticationManager();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	/*@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }*/

}



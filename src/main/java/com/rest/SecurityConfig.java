package com.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity

public class SecurityConfig  extends WebSecurityConfigurerAdapter{

	@Override
	public void configure(HttpSecurity http) throws Exception 
	{
		
		/*http.authorizeHttpRequests((requests)->requests
				.requestMatchers(new AntPathRequestMatcher("/**")).
				permitAll().
				anyRequest().
				authenticated());
		*/
		/*try {
			http.authorizeHttpRequests()
			.antMatchers(HttpMethod.GET, "/home/**").hasAnyRole("USER","ADMIN")
			.antMatchers(HttpMethod.GET,"/home/user/**").hasRole("USER")
			.antMatchers(HttpMethod.POST,"/home").hasRole("USER")
			.anyRequest()
			.authenticated();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		http.authorizeHttpRequests().antMatchers(HttpMethod.POST,"/auth").permitAll();
		

	}
	
	@Override 
	public void configure(AuthenticationManagerBuilder builder) 
	{
	 /* try {
		builder.inMemoryAuthentication().withUser("admin").password("{noop}password").authorities(new SimpleGrantedAuthority("USER"));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	}

	
/*	@Bean
	public AuthenticationManager getAuth()  
	{
		try {
			return super.authenticationManager();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}*/

}



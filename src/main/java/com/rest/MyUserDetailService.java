package com.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class MyUserDetailService implements UserDetailsService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username)  {
		// TODO Auto-generated method stub
		System.out.println("username"+username);
	   User user=userRepository.findById(username).get();
	   if(user==null)
	   {
		   System.out.println("user is null");
	   }
	   System.out.println("loading user");
	   System.out.println("user details "+user.getUsername()+" password "+user.getPassword());
		return new MyUserDetails(user);
	}
}




package com.rest;
import java.util.*;

import org.springframework.beans.factory.annotation.Value;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
public class JWTUtil {

	
	
	public String generateToken(Map<String,Object> map,String subject,String secretkey)
	{
		String tokenstr=	 Jwts.builder().setClaims(map).setSubject(subject).signWith(SignatureAlgorithm.HS512, secretkey).compact();

	 return tokenstr;
	}
	
	
	
	
	
	public String validate(String token,String secretkey)
	{
		String userinfo= Jwts.parser().setSigningKey(secretkey).parseClaimsJws(token).getBody().getSubject();
		return userinfo;
	}
}

package com.transporte.autentificacion.security;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

public class TokenUtils {
	private final static String ACCES_TOKEN_SECRET  = "4qhq8LrEBfYcaRHxhdb9zURb2rf8e7Ud";
	private final static Long ACCES_TOKEN_VALIDITY_SECONDS =  600L;
	
	public static String createToken(String nombre, String email) {
		
		long tiempoExpiracion = ACCES_TOKEN_VALIDITY_SECONDS * 1_000;
		Date fechaExpiracion = new Date(System.currentTimeMillis() + tiempoExpiracion);
		
		
		
		
		Map<String, Object> extra = new HashMap<>();
		extra.put("nombre", nombre);
		
		
		return Jwts.builder()
				.setSubject(email)
				.setExpiration(fechaExpiracion)
				.addClaims(extra)
				.signWith(Keys.hmacShaKeyFor(ACCES_TOKEN_SECRET.getBytes()))
				.compact();
	}
	
	
	public static UsernamePasswordAuthenticationToken getAutentication(String token) {
		try {
			Claims claims = Jwts.parserBuilder()
					.setSigningKey(ACCES_TOKEN_SECRET.getBytes())
					.build()
					.parseClaimsJws(token)
					.getBody();
			
			String email = claims.getSubject();
			
			return new UsernamePasswordAuthenticationToken(email, null , Collections.emptyList());
		} catch (Exception e) {
			return null;
		}
		
	}
}	

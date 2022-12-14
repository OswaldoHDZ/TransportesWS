package com.transporte.autentificacion.security;

import java.io.IOException;
import java.util.Collections;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.transporte.autentificacion.models.AuthCredencials;


public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
	
	@Override
	public Authentication attemptAuthentication(HttpServletRequest request ,
			HttpServletResponse response) {
		AuthCredencials authCredencials = new AuthCredencials();
		try {
			authCredencials = new ObjectMapper().readValue(request.getReader(), AuthCredencials.class);
		} catch (Exception e) {
			System.out.println("Error : ");
			System.out.println(e);
		}
		UsernamePasswordAuthenticationToken usernamePAT = new UsernamePasswordAuthenticationToken
				(authCredencials.getEmail(), authCredencials.getPassword(), Collections.emptyList());
		return getAuthenticationManager().authenticate(usernamePAT);
	}
	
	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {
		UserDetailsImp userDetails = (UserDetailsImp) authResult.getPrincipal();
		String token = TokenUtils.createToken(userDetails.getNombre(),userDetails.getUsername());
		response.addHeader("Authorization", "Bearer " + token);
		response.getWriter().flush();
		super.successfulAuthentication(request, response, chain, authResult);
	}

}

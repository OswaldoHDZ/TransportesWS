package com.transporte.autentificacion.security;

import java.io.IOException;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JWTAuthorizationFilter extends OncePerRequestFilter{

	//Metodos para autorisar el uso de los metodos del cliente
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {


		String beaterToken = request.getHeader("Authorization");
		
		if(beaterToken != null && beaterToken.startsWith("Bearer ")) {
			String token = beaterToken.replace("Bearer ", "");
			UsernamePasswordAuthenticationToken usernamePAT = TokenUtils.getAutentication(token);
			SecurityContextHolder.getContext().setAuthentication(usernamePAT);
		}
		filterChain.doFilter(request, response);
	}

}

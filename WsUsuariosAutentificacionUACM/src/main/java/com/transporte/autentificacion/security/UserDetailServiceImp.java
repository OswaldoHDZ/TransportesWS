package com.transporte.autentificacion.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.transporte.autentificacion.models.document.Usuario;
import com.transporte.autentificacion.models.repository.IUsuarioRepository;
@Service
public class UserDetailServiceImp implements UserDetailsService {

	@Autowired
	IUsuarioRepository _usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Usuario usuario = new Usuario();
		try {	
			usuario = _usuarioRepository.findByEmail(email);
		} catch (Exception e) {
			System.out.println("No encuentro el usuario");
		}
		try {
			return new UserDetailsImp(usuario);
		} catch (Exception e) {
			System.out.println("Error al UserDetailsImp");
		}
		System.out.println("REGRESA NULL");
		return null;
		
	}
	
	
	
}

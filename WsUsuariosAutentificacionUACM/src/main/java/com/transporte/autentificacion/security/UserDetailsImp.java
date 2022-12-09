package com.transporte.autentificacion.security;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.transporte.autentificacion.models.document.Usuario;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserDetailsImp implements UserDetails {

	private final Usuario _usuario;
	
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Collections.emptyList();
	}

	@Override
	public String getPassword() {
		return _usuario.getPassword();
	}

	@Override
	public String getUsername() {
		return _usuario.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
	public String getNombre() {
		return _usuario.getNombre();
	}
	
	

}

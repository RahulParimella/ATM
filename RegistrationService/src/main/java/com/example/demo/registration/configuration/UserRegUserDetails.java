package com.example.demo.registration.configuration;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo.registration.model.UserRegistration;

public class UserRegUserDetails implements UserDetails {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
    private String password;
    private List<GrantedAuthority> authorities;

    public UserRegUserDetails(UserRegistration userInfo) {
    	username=userInfo.getName();
        password=userInfo.getPassword();
        authorities= Arrays.stream(userInfo.getRole().split(","))
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
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

	
}

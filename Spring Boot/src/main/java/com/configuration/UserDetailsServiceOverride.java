package com.configuration;

import java.util.Optional;

import com.model.MyUserDetails;
import com.model.User;
import com.model.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceOverride implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUsername(username);
        //If user doesn't exist, throw error
        user.orElseThrow(() -> new UsernameNotFoundException("Not found: "+username));
        //get all user instances
        return user.map(MyUserDetails::new).get();
    }
    
}

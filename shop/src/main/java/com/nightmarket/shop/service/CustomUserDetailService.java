package com.nightmarket.shop.service;

import com.nightmarket.shop.model.CustomUserDetail;
import com.nightmarket.shop.model.Role;
import com.nightmarket.shop.model.User;
import com.nightmarket.shop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    //    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException{
//        Optional<User> user = userRepository.findUserByEmail(email);
//        user.orElseThrow(() -> new UsernameNotFoundException("User not found"));
//        return user.map(CustomUserDetailService::new).get();
//    }
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findUserByEmail(email);
        if (user.isEmpty()) {
            throw new UsernameNotFoundException("Username not found");
        } else {
            return new CustomUserDetail(user.get());
        }
    }
//    private Set<GrantedAuthority> convertAuthorities(Set<Role> userRoles) {
//        Set<GrantedAuthority> authorities=new HashSet<>();
//        for (Role userRole : userRoles) {
//            authorities.add(new SimpleGrantedAuthority(userRole.getRoleName()));
//        }
//        return authorities;
//    }
}

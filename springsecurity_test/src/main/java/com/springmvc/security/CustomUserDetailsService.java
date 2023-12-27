package com.springmvc.security;


import com.springmvc.mapper.MemberMapper;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Log4j
@Service
public class CustomUserDetailsService implements UserDetailsService {

  @Autowired
  private MemberMapper memberMapper;

  @Override
  public UserDetails loadUserByUsername(String userName)
          throws UsernameNotFoundException {

    log.warn("Load User By UserName : " + userName);


    return null;
  }

}
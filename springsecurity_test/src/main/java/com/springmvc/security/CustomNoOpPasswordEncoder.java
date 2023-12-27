package com.springmvc.security;

import lombok.extern.log4j.Log4j;
import org.springframework.security.crypto.password.PasswordEncoder;

@Log4j
public class CustomNoOpPasswordEncoder implements PasswordEncoder {

  public String encode(CharSequence rawPassword){

    return rawPassword.toString();
  }

  public boolean matches(CharSequence rawPassword, String encodedPassword){
    log.warn("mathches: "+ rawPassword+":"+encodedPassword);
    return rawPassword.toString().equals(encodedPassword);
  }
}

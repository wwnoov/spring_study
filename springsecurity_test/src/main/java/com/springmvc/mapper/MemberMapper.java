package com.springmvc.mapper;

import com.springmvc.domain.MemberVO;

public interface MemberMapper {
  public MemberVO read(String userid);
}

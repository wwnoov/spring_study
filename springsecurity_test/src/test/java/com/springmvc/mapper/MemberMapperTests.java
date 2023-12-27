package com.springmvc.mapper;


import com.springmvc.domain.MemberVO;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j
public class MemberMapperTests {

  @Autowired
  private MemberMapper mapper;

  @Test
  public void testMemberMapper() {
    log.info(mapper + " ");
  }


  @Test
  public void testRead() {

    MemberVO vo = mapper.read("admin90");

    log.info(vo);

    vo.getAuthList().forEach(authVO -> log.info(authVO));

  }

}

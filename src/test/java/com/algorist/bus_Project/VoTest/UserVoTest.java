package com.algorist.bus_Project.VoTest;

import com.algorist.User.Vo.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class UserVoTest {
   @Test
    public void getId(){
       final User user = User.builder()
               .userid("id_test")
               .password("password_test")
               .name("name_test")
               .build();

       final String userid = user.getUserid();
       assertEquals("id_test",userid);
   }
}
//assertEquals(a, b);	a와 b 값이 일치하는지 확인
//assertSame(a, b);	 a와 b가 같은 객체임을 확인
//assertTrue(a);	조건 a가 참인가를 확인
//assertNotNull(a);	 객체 a가 null이 아님을 확인
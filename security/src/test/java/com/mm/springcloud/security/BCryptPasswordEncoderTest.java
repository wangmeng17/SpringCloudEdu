package com.mm.springcloud.security;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: wang.meng
 * @Date: 2018/12/17  11:06
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BCryptPasswordEncoderTest {

    @Test
    public void cryptTest(){
        String str = "123456";
        String strCrypted = new BCryptPasswordEncoder().encode(str);
        System.out.println(strCrypted);
    }
}

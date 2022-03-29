package com.ppdai.auth;

import com.ppdai.auth.utils.Md5Tool;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PauthAppTests {

	@Test
	public void contextLoads() {
		String loginPwd = Md5Tool.getStringMd5("admin" + "ZO]7>u#-");
		System.out.println("=================================");
		System.out.println(loginPwd);
	}

}

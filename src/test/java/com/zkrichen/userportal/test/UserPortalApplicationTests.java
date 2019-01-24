package com.zkrichen.userportal.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserPortalApplicationTests {

	@Test
	public void contextLoads() {
		int x= 1;
		assert(x==1);
	}

}

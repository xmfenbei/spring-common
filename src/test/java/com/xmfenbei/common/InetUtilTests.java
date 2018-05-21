package com.xmfenbei.common;

import com.xmfenbei.common.util.InetUtil;
import com.xmfenbei.common.util.UniqueIdUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InetUtilTests {

	@Test
	public void getLocalMacAddressWithDash() {
		System.out.print(InetUtil.getLocalMacAddressWithDash());
	}

	@Test
	public void getLocalMacAddressWithoutDash() {
		System.out.print(InetUtil.getLocalMacAddressWithoutDash());
	}

}

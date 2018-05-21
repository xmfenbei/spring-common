package com.xmfenbei.common;

import com.xmfenbei.common.util.UniqueIdUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UniqueIdUtilTests {

	@Test
	public void getUuId() {
		System.out.print(UniqueIdUtil.getUuId());
	}

}

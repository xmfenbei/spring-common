package com.xmfenbei.common.util;

import com.xmfenbei.common.CommonApplication;
import org.springframework.boot.SpringApplication;

import java.util.UUID;

/**
 * Create date 2018/05/21
 * <p>唯一ID工具类</p>
 *
 * @author xmfenbei
 * @since 0.0.1
 */
public class UniqueIdUtil {

    /**
     * 获取UUID
     * @return UUID
     */
    public static String getUuId(){
        return UUID.randomUUID().toString().replace("-", "");
    }
}

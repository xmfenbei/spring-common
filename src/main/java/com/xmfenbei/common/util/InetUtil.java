package com.xmfenbei.common.util;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * Create date 2018/05/21
 * <p>网络工具类</p>
 *
 * @author xmfenbei
 * @since 0.0.1
 */
public class InetUtil {

    /**
     * 获取本机mac地址（带"-"）
     * 30-B4-9E-AC-BB-2B
     * @return mac地址（带"-"）
     */
    public static String getLocalMacAddressWithDash(){
        return getLocalMacAddress(Boolean.TRUE);
    }

    public static String getLocalMacAddress(Boolean withDash){
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            byte[] mac = NetworkInterface.getByInetAddress(inetAddress).getHardwareAddress();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < mac.length; i++) {
                if (i != 0 && withDash) {
                    sb.append("-");
                }
                String s = Integer.toHexString(mac[i] & 0xFF);
                sb.append(s.length() == 1 ? 0 + s : s);
            }
            return sb.toString().trim().toUpperCase();
        } catch (UnknownHostException | SocketException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 获取本机mac地址（不带"-"）
     * 30B49EACBB2B
     * @return mac地址（不带"-"）
     */
    public static String getLocalMacAddressWithoutDash(){
        return getLocalMacAddress(Boolean.FALSE);
    }
}

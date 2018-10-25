package com.zym.gauss;

/**
 * @author zym
 * @date 18/10/8 下午4:59
 */
public class Utils {
    public static void main(String[] args) {
        long sequenceMask = -1L ^ (-1L << 12L);
        System.out.println(-1L << 12L);
        System.out.println(sequenceMask);
        System.out.println(-1L ^ -2L);
    }
}

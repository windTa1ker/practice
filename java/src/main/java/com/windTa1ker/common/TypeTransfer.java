package com.windTa1ker.common;

public class TypeTransfer {

    public static void byte2Int(byte b) {
        int res = b & 0xff;
        System.out.println(res);
    }

    public static void main(String[] args) {
        byte2Int((byte) 0b11111111);
    }
}

package com.windTa1ker.practice;

import com.windTa1ker.practice.interfaces.OneInterfaceImpl;

public class Main {
    public static void main(String[] args) {
        OneInterfaceImpl oii = new OneInterfaceImpl();
        System.out.println(oii.hello("world"));
    }
}

package com.windTa1ker.practice.interfaces;

public class OneInterfaceImpl implements OneInterface{
    @Override
    public String hello(String word) {
        return "hello, " + word;
    }
}

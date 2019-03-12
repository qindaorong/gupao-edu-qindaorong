package com.design.pattern;


import java.lang.reflect.Method;

public class MyProxyTest {

    public static void main(String[] args) {
        try {

            //JDK动态代理的实现原理
            Object obj = new ZhenAiWang().getInstance(new Girl());
            Method method = obj.getClass().getMethod("findLove",null);
            method.invoke(obj);


        }catch (Exception e){
            e.printStackTrace();
        }

    }

}

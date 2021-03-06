package com.design.pattern.singleton.doublecheck;


/**
 * 双重检查锁
 */
public class LazyDoubleCheckSingleton {


    private LazyDoubleCheckSingleton(){}

    private volatile static LazyDoubleCheckSingleton lazy = null;

    public static LazyDoubleCheckSingleton getInstance(){
        if (lazy==null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazy==null){
                    lazy=  new LazyDoubleCheckSingleton();

                }
            }
        }
        return lazy;

    }
}

package com.design.pattern.javassist;

public class DemoA {
    public void save(){
        System.out.println("保存商品");
    }
    public void del(){
        System.out.println("删除商品");
    }


    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        System.out.println("*******************方式一*******************");
        JavassistProxyFactory<DemoA> jpf = new JavassistProxyFactory<DemoA>();
        DemoA a = new DemoA();
        jpf.setTarget(a);
        DemoA proxy = jpf.getProxy();
        proxy.del();

        System.out.println("*******************方式二*******************");
        JavassistProxyFactory02 jpf02 = new JavassistProxyFactory02();
        DemoA a2 = (DemoA) jpf02.getProxy(DemoA.class);
        a2.del();
        a2.save();



    }
}

package com.handl.structuraltype.daili;

import java.lang.reflect.InvocationHandler;

/**
 * Created by handl on 2017/10/13.
 *
 * Proxy这个类的作用就是用来动态创建一个代理对象的类，它提供了许多的方法，
 *      但是我们用的最多的就是 newProxyInstance 这个方法：
 *
 * 这个方法的作用就是得到一个动态的代理对象，
 * 其接收三个参数，我们来看看这三个参数所代表的含义：
         loader:一个ClassLoader对象，定义了由哪个ClassLoader对象来对生成的代理对象进行加载
         interfaces:一个Interface对象的数组，表示的是我将要给我需要代理的对象提供一组
                        什么接口，如果我提供了一组接口给它，
                        那么这个代理对象就宣称实现了该接口(多态)，
                        这样我就能调用这组接口中的方法了
         h:一个InvocationHandler对象，表示的是当我这个动态代理对象在调用方法的时候，
                        会关联到哪一个InvocationHandler对象上
 *
 */
public class DongTaiDaiLiClient {

    public static DongTaiDaiLiSubject invokeMethod(){
        // 我们要代理的真实对象
        DongTaiDaiLiSubject realeSubject = new DongTaiDaiLiRealeSubject();
        //我们要代理哪个真实对象，就将该对象传进去，最后是通过该真实对象来调用其方法的
        InvocationHandler handler = new DongTaiDaiLiProxy(realeSubject);
        /*
         * 通过Proxy的newProxyInstance方法来创建我们的代理对象，我们来看看其三个参数
         * 第一个参数 handler.getClass().getClassLoader() ，
         *      我们这里使用handler这个类的ClassLoader对象来加载我们的代理对象
         * 第二个参数realSubject.getClass().getInterfaces()，
         *      我们这里为代理对象提供的接口是真实对象所实行的接口，
         *      表示我要代理的是该真实对象，这样我就能调用这组接口中的方法了
         * 第三个参数handler， 我们这里将这个代理对象关联到了上方的 InvocationHandler 这个对象上
         */
        DongTaiDaiLiSubject subject = (DongTaiDaiLiSubject) java.lang.reflect.Proxy.newProxyInstance(handler.getClass().getClassLoader(),
                realeSubject.getClass().getInterfaces(), handler);
        System.out.println(subject.getClass().getName());
        return subject;
    }


}

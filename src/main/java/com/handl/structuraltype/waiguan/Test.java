package com.handl.structuraltype.waiguan;

/**
 * Created by handl on 2017/9/22.
 *
 * 外观模式：为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，
 *          这个接口使得这一子系统更加容易使用
 *
 *   例如mvc模式就是对客户端提供的统一调用接口，客户端必须知道service曾或者modul曾的具体实现。
 *
 *   1.外观类，持有子系统的引用，构造函数中创建子系统对象实例
 *          提供对客户端统一封装(可以任意组合)调用的方法.
 *
 *   2.子系统类SubOne，SubTwo，单独的功能模块
 *
 */
public class Test {

    public static void main(String[] args) {
        //客户端创建并使用外观类
        Facade facade = new Facade();

        facade.say();
        facade.eat();

    }


}

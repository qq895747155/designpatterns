package com.handl.structuraltype.xiangyuan;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by handl on 2017/9/29.
 *
 * 享元工厂类：用来创建享元对象(有了就直接返回，没有先创建然后再返回)
 *
 */
public class WuZiQiFlyweightFactory {

    private Map<String,WuZiQiFlyweight> map = new HashMap<>();

    //定义创建享元对象的接口,享元对象通过判断内部属性状态来确定有没有创建，这里是颜色
    public WuZiQiFlyweight createFlyweight(String colour){
        if(map.containsKey(colour)){
            //有就直接返回
            return map.get(colour);
        }else {
            //没有就先创建在返回
            WuZiQiFlyweight flyweight = new WuZiQiConcreteFlyweight(colour);
            map.put(colour,flyweight);
            return flyweight;
        }
    }
}

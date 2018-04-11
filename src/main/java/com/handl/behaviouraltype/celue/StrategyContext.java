package com.handl.behaviouraltype.celue;

/**
 * Created by handl on 2017/9/22.
 *
 * 策略上下文类：
 *  维护一个使用的策略类
 *  提供调用策略类算法的方法
 */
public class StrategyContext {

    private Strategy strategy;

    /**
     * 直接传入一个具体的策略类
     * @param strategy
     */
    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 在策略上下文类中自己创建具体的策略类
     * 1.调用工厂类并传入标识，让工厂类类创建
     * 2.可以自己通过标识创建，这种方式可以不用策略工厂类，相当于这里做了工厂类的工作
     * @param flag
     */
    public StrategyContext(final String flag) {
        //方式1
//        this.strategy = StrategyFactory.createStrategy(flag);

        //方式2
        switch (flag){
            case "A":
                this.strategy = new StrategyA();
                break;
            case "B":
                this.strategy = new StrategyB();
                break;
            default:
                System.out.println("策略不存在 !!!");
                break;
        }
    }

    /**
     * 代理策略类的调用
     */
    public void strategyResult(){
        this.strategy.result();
    }
}

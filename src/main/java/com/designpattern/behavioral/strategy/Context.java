package com.designpattern.behavioral.strategy;

import com.designpattern.behavioral.strategy.strategies.Strategy;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 16:18
 * @Description:
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}

package com.designpattern.behavioral.strategy.strategies;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 16:18
 * @Description:
 */
public class OperationSubtraction implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}

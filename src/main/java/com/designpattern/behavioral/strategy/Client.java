package com.designpattern.behavioral.strategy;

import com.designpattern.behavioral.strategy.strategies.OperationAdd;
import com.designpattern.behavioral.strategy.strategies.OperationMultiply;
import com.designpattern.behavioral.strategy.strategies.OperationSubtraction;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 16:18
 * @Description: 策略模式测试
 */
public class Client {
    public static void main(String[] args) {
        int a = new Context(new OperationAdd()).executeStrategy(1, 2);
        System.out.println(a);

        int b = new Context(new OperationSubtraction()).executeStrategy(1, 2);
        System.out.println(b);

        int c = new Context(new OperationMultiply()).executeStrategy(1, 2);
        System.out.println(c);

    }
}

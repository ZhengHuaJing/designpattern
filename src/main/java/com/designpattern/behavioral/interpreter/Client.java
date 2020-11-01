package com.designpattern.behavioral.interpreter;

import com.designpattern.behavioral.interpreter.expressions.AndExpression;
import com.designpattern.behavioral.interpreter.expressions.Expression;
import com.designpattern.behavioral.interpreter.expressions.OrExpression;
import com.designpattern.behavioral.interpreter.expressions.TerminalExpression;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 11:02
 * @Description: 解释器模式测试
 */
public class Client {
    public static void main(String[] args) {
        Expression a = new TerminalExpression("a");
        Expression b = new TerminalExpression("b");

        Expression andExpression = new AndExpression(a, b);
        Expression orExpression = new OrExpression(a, b);

        System.out.println(andExpression.interpret("a"));
        System.out.println(orExpression.interpret("b"));

    }
}

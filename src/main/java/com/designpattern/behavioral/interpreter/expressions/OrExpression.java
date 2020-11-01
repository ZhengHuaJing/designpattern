package com.designpattern.behavioral.interpreter.expressions;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 10:56
 * @Description:
 */
public class OrExpression implements Expression {
    private Expression expr1;
    private Expression expr2;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String content) {
        return expr1.interpret(content) || expr2.interpret(content);
    }
}

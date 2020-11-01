package com.designpattern.behavioral.interpreter.expressions;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 10:56
 * @Description:
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String content) {
        return data.contains(content);
    }

}

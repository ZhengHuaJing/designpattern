package com.designpattern.behavioral.visitor;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 17:25
 * @Description:
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}

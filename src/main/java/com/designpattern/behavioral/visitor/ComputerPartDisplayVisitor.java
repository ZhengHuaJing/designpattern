package com.designpattern.behavioral.visitor;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 17:26
 * @Description:
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println(computer);
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println(mouse);
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println(keyboard);
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println(monitor);
    }
}

package com.designpattern.behavioral.visitor;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 17:25
 * @Description:
 */
public class Computer implements ComputerPart {
    private ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Mouse(), new Monitor(), new Keyboard()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }

        computerPartVisitor.visit(this);
    }
}

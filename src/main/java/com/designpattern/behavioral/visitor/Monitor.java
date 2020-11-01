package com.designpattern.behavioral.visitor;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 17:24
 * @Description:
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

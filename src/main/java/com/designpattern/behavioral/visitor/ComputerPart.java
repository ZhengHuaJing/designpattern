package com.designpattern.behavioral.visitor;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 17:24
 * @Description:
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}

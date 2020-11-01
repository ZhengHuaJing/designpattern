package com.designpattern.behavioral.command.commands;

import com.designpattern.behavioral.command.Stock;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 10:26
 * @Description:
 */
public class SellStock implements Command {
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}

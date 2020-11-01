package com.designpattern.behavioral.command.commands;

import com.designpattern.behavioral.command.Stock;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 10:27
 * @Description:
 */
public class BuyStock implements Command {

    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}

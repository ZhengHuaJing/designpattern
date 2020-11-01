package com.designpattern.behavioral.command;

import com.designpattern.behavioral.command.commands.BuyStock;
import com.designpattern.behavioral.command.commands.SellStock;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 10:26
 * @Description: 命令模式测试
 */
public class Client {
    public static void main(String[] args) {
        Broker broker = new Broker();
        broker.addCommand(new SellStock(new Stock()));
        broker.addCommand(new BuyStock(new Stock()));
        broker.executeCommands();
    }
}

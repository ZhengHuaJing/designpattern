package com.designpattern.behavioral.command;

import com.designpattern.behavioral.command.commands.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 10:26
 * @Description:
 */
public class Broker {

    private List<Command> commands;

    public Broker() {
        commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommands() {
        commands.forEach(Command::execute);
    }
}

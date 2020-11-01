package com.designpattern.behavioral.chainofresponsibility.loggers;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 08:58
 * @Description:
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("FileLogger: " + message);
    }
}

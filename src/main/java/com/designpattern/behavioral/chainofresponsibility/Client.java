package com.designpattern.behavioral.chainofresponsibility;

import com.designpattern.behavioral.chainofresponsibility.loggers.AbstractLogger;
import com.designpattern.behavioral.chainofresponsibility.loggers.ConsoleLogger;
import com.designpattern.behavioral.chainofresponsibility.loggers.ErrorLogger;
import com.designpattern.behavioral.chainofresponsibility.loggers.FileLogger;

/**
 * @Auther: ZhengHuaJing
 * @Date: 2020/10/14 08:59
 * @Description: 责任链模式测试
 */
public class Client {
    public static void main(String[] args) {
        ErrorLogger logger = new ErrorLogger(AbstractLogger.ERROR);
        FileLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        ConsoleLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        logger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        logger.logMessage(AbstractLogger.INFO, "系统启动...");
        System.out.println();
        logger.logMessage(AbstractLogger.ERROR, "系统出错...");
        System.out.println();
        logger.logMessage(AbstractLogger.DEBUG, "系统bug...");

    }
}

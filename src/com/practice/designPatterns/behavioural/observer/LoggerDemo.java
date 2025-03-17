package com.practice.designPatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LoggerDemo {
    public static void main(String args[]) {
        Logger logger = Logger.getInstance();
        logger.registerAppender(new FileAppender());
        logger.registerAppender(new ConsoleAppender());
        logger.log("hello");
    }
}
class Logger{
    private Set<AbstractAppender> appenderSet = new HashSet<>();
    private  Logger() {
        registerAppender(new FileAppender());
        registerAppender(new ConsoleAppender());
    };
    private static class BilPurghSingleton {
        private static final Logger INSTANCE = new Logger();
    }
    public static Logger getInstance() {
        return BilPurghSingleton.INSTANCE;
    }
    public void registerAppender(AbstractAppender appender) {
        appenderSet.add(appender);
    }

    public void log(String message) {
        for(AbstractAppender appender : appenderSet) {
            appender.append(message);
        }
    }

}
interface  AbstractAppender {
    void append(String message);
}
class FileAppender implements AbstractAppender {

    @Override
    public void append(String message) {
        System.out.println(message);
    }

}
class ConsoleAppender implements AbstractAppender {

    @Override
    public void append(String message) {
        System.out.println(message);
    }
}


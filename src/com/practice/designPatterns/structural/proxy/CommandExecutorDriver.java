package com.practice.designPatterns.structural.proxy;

public class CommandExecutorDriver implements  CommandExecutor{
    @Override
    public void executeCommand(String command) throws Exception {
        Runtime.getRuntime().exec(command);
        System.out.println(command+" => Command Executed Successfully");

    }
}

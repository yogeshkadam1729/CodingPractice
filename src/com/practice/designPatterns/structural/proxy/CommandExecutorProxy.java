package com.practice.designPatterns.structural.proxy;

public class CommandExecutorProxy implements  CommandExecutor{

    private boolean isAdmin;
    private CommandExecutorDriver commandExecutorDriver;

    public CommandExecutorProxy(String userId,String password) {
        if(userId.equalsIgnoreCase("yogesh") && password.equalsIgnoreCase("admin")) isAdmin = true;
    }
    @Override
    public void executeCommand(String command) throws Exception {
        if(isAdmin) {
            commandExecutorDriver = new CommandExecutorDriver();
            commandExecutorDriver.executeCommand(command);
        }
        else {
            System.out.println("Access Denied to execute the command");
        }
    }
}


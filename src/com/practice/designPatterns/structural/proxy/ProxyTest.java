package com.practice.designPatterns.structural.proxy;

public class ProxyTest {
    public static void  main(String args[]) throws Exception {
        CommandExecutorProxy proxy = new CommandExecutorProxy("yogesh1","admin1");
        proxy.executeCommand("dir");
    }
}


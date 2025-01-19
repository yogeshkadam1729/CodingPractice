package com.practice.designPatterns.behavioural.template;

public abstract class CustomJDBCTemplate {

    public final void build(String datasourceName) {
        openJDBCConnection(datasourceName);
        executeStatement();
        closeConnection(datasourceName);
    }
    abstract  void executeStatement();

    private final void openJDBCConnection(String datasourceName) {
        System.out.println("Opening JDBC Connection for datasource "+datasourceName);
    }

    private final void closeConnection(String datasourceName) {
        System.out.println("Closing JDBC Connection for datasource "+datasourceName);
    }
}


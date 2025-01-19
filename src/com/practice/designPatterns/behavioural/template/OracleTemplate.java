package com.practice.designPatterns.behavioural.template;

public class OracleTemplate extends CustomJDBCTemplate{

    public OracleTemplate() {
        //super("Oracle");
    }

    @Override
    void executeStatement() {
        System.out.println("Executing the statement using the postgres template with oracle syntax checking");
    }
}


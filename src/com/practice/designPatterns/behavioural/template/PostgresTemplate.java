package com.practice.designPatterns.behavioural.template;
public class PostgresTemplate extends CustomJDBCTemplate {


    public PostgresTemplate() {
        //super("postgres");
    }

    @Override
    void executeStatement() {
        System.out.println("Executing the statement using the postgres template with postgres syntax checking");

    }
}

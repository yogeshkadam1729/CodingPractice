package com.practice.designPatterns.behavioural.template;

public class TemplateTest {

    public static void main(String args []) {
        CustomJDBCTemplate customJDBCTemplate = new PostgresTemplate();
        customJDBCTemplate.build("postgres");
        CustomJDBCTemplate customJDBCTemplate1 = new OracleTemplate();
        customJDBCTemplate1.build("oracle");
    }
}


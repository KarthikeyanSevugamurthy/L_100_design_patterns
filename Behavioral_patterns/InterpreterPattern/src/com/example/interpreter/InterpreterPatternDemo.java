package com.example.interpreter;

public class InterpreterPatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        // Example query: SELECT name FROM students
        Expression select = new SelectExpression("name");
        Expression query1 = new FromExpression("students", select);

        // Example query: SELECT age FROM students
        Expression selectAge = new SelectExpression("age");
        Expression query2 = new FromExpression("students", selectAge);

        System.out.println("Query 1 result: " + query1.interpret(context));
        System.out.println("Query 2 result: " + query2.interpret(context));
    }
}

package com.example.interpreter;

public class SelectExpression implements Expression {
    private String column;

    public SelectExpression(String column) {
        this.column = column;
    }

    @Override
    public String interpret(Context context) {
        return context.getColumnValue(column);
    }
}

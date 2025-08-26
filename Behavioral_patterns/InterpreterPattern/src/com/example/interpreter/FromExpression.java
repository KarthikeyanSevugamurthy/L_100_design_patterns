package com.example.interpreter;

public class FromExpression implements Expression {
    private String table;
    private Expression selectExpression;

    public FromExpression(String table, Expression selectExpression) {
        this.table = table;
        this.selectExpression = selectExpression;
    }

    @Override
    public String interpret(Context context) {
        if (context.isValidTable(table)) {
            return selectExpression.interpret(context);
        } else {
            return "Table not found: " + table;
        }
    }
}

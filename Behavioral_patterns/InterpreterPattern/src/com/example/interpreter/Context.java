package com.example.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<String, Map<String, String>> database = new HashMap<>();

    public Context() {
        Map<String, String> student = new HashMap<>();
        student.put("name", "Alice");
        student.put("age", "21");
        database.put("students", student);
    }

    public boolean isValidTable(String table) {
        return database.containsKey(table);
    }

    public String getColumnValue(String column) {
        return database.get("students").getOrDefault(column, "Column not found: " + column);
    }
}

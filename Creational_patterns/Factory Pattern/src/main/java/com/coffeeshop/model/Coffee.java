package com.coffeeshop.model;

/**
 * Base interface for all coffee types
 * This ensures all coffee objects have consistent behavior
 */
public interface Coffee {
    void prepare();
    String getName();
    double getPrice();
    int getPreparationTime();
}
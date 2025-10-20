/**
 * Name: SRUJANA NIRANJANKUMAR
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2025
 * File Name: Customer.java
 * Description: This file defines the class members and operations for Customer class
 */
package edu.bu.met.cs665.example1;

/**
 * This is a Customer class
 */
public class Customer {
    private final String name;
    private final CustomerKind kind;

    // Parameterized Constructor (setters) and getters below
    public Customer(String name, CustomerKind kind) {
        this.name = name;
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public CustomerKind getKind() {
        return kind;
    }
}

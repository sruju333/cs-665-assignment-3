/**
 * Name: SRUJANA NIRANJANKUMAR
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2025
 * File Name: Email.java
 * Description: This file defines the class members and operations for Email class
 */
package edu.bu.met.cs665.example1;

/**
 * This is an Email class
 */
public class Email {
    private final String subject;
    private final String body;

    // Parameterized Constructor (setters) and getters below
    public Email(String subject, String body) {
        this.subject = subject;
        this.body = body;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }
}

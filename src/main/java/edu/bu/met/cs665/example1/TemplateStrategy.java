/**
 * Name: SRUJANA NIRANJANKUMAR
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2025
 * File Name: TemplateStrategy.java
 * Description: This file defines the operations subjectFor and bodyFor for TemplateStrategy interface
 */
package edu.bu.met.cs665.example1;

/**
 * This is a TemplateStrategy interface
 */
public interface TemplateStrategy {
    /**
     * Customer classes will implement this interface method for Email subject content based on strategy
     * @param c Customer object containing name and kind details
     * @return String subject text
     */
    String subjectFor(Customer c);

    /**
     * Customer classes will implement this interface method for Email body content based on strategy
     * @param c Customer object containing name and kind details
     * @return String body text
     */
    String bodyFor(Customer c);
}

/**
 * Name: SRUJANA NIRANJANKUMAR
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2025
 * File Name: Frequent.java
 * Description: This file implements the methods in Frequent class from TemplateStrategy interface
 */
package edu.bu.met.cs665.example1;

/**
 * This is a Frequent customer class
 */
public class Frequent implements TemplateStrategy {
    /**
     * Frequent customer Email subject text implementation
     * @param c Customer object containing name and kind details
     * @return String subject text
     */
    public String subjectFor(Customer c) {
        return c.getName() + ", thanks for being a regular";
    }

    /**
     * Frequent customer Email body text implementation
     * @param c Customer object containing name and kind details
     * @return String body text
     */
    public String bodyFor(Customer c) {
        return "Hello " + c.getName() + ",\n"
                + "We appreciate your continued trust. Enjoy early access and a loyalty perk this week.";
    }
}

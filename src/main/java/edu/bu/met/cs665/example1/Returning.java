/**
 * Name: SRUJANA NIRANJANKUMAR
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2025
 * File Name: Returning.java
 * Description: This file implements the methods in Returning class from TemplateStrategy interface
 */
package edu.bu.met.cs665.example1;

/**
 * This is a Returning customer class
 */
public class Returning implements TemplateStrategy {
    /**
     * Returning customer Email subject text implementation
     * @param c Customer object containing name and kind details
     * @return String subject text
     */
    public String subjectFor(Customer c) {
        return "Welcome back, " + c.getName() + " — what’s new";
    }

    /**
     * Returning customer Email body text implementation
     * @param c Customer object containing name and kind details
     * @return String body text
     */
    public String bodyFor(Customer c) {
        return "Hi " + c.getName() + ",\n"
                + "Since your last visit, we added smarter picks and faster checkout.\n"
                + "Here’s a quick recap tailored for you.";
    }
}

/**
 * Name: SRUJANA NIRANJANKUMAR
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2025
 * File Name: New.java
 * Description: This file implements the methods in New class from TemplateStrategy interface
 */
package edu.bu.met.cs665.example1;

/**
 * This is a New customer class
 */
public class New implements TemplateStrategy {
    /**
     * New customer Email subject text implementation
     * @param c Customer object containing name and kind details
     * @return String subject text
     */
    public String subjectFor(Customer c) {
        return "Welcome " + c.getName() + " - start in minutes";
    }

    /**
     * New customer Email body text implementation
     * @param c Customer object containing name and kind details
     * @return String body text
     */
    public String bodyFor(Customer c) {
        return "Hi " + c.getName() + ",\n"
                + "Thanks for joining! Here’s a short setup guide and tips to get value right away.";
    }
}

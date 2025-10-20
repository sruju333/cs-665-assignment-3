/**
 * Name: SRUJANA NIRANJANKUMAR
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2025
 * File Name: Business.java
 * Description: This file implements the methods in Business class from TemplateStrategy interface
 */
package edu.bu.met.cs665.example1;

/**
 * This is a Business customer class
 */
public class Business implements TemplateStrategy {
    /**
     * Business customer Email subject text implementation
     * @param c Customer object containing name and kind details
     * @return String subject text
     */
    public String subjectFor(Customer c) {
        return "Q-update & roadmap for " + c.getName();
    }

    /**
     * Business customer Email body text implementation
     * @param c Customer object containing name and kind details
     * @return String body text
     */
    public String bodyFor(Customer c) {
        return "Hello " + c.getName() + ",\n"
                + "Here’s a summary of integrations and cost optimizations relevant to your team.\n"
                + "Reply to schedule a roadmap sync.";
    }
}

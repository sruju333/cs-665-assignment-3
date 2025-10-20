/**
 * Name: SRUJANA NIRANJANKUMAR
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2025
 * File Name: Vip.java
 * Description: This file implements the methods in Vip class from TemplateStrategy interface
 */
package edu.bu.met.cs665.example1;

/**
 * This is a Vip customer class
 */
public class Vip implements TemplateStrategy{
    /**
     * Vip customer Email subject text implementation
     * @param c Customer object containing name and kind details
     * @return String subject text
     */
    public String subjectFor(Customer c) {
        return "Exclusive access for " + c.getName();
    }

    /**
     * Vip customer Email body text implementation
     * @param c Customer object containing name and kind details
     * @return String body text
     */
    public String bodyFor(Customer c) {
        return "Dear " + c.getName() + ",\n"
                + "As one of our top customers, you now have priority support and an early preview of upcoming features.";
    }
}

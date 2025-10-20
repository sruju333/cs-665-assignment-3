/**
 * Name: SRUJANA NIRANJANKUMAR
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2025
 * File Name: MailEngine.java
 * Description: This file defines the operations for MailEngine class
 */
package edu.bu.met.cs665.example1;

import java.util.EnumMap;
import java.util.Map;

/**
 * This is a MailEngine class
 */
public class MailEngine {
    private final Map<CustomerKind, TemplateStrategy> strategies =
            new EnumMap<>(CustomerKind.class);

    // Constructor
    public MailEngine() {
        register(CustomerKind.BUSINESS,  new Business());
        register(CustomerKind.RETURNING, new Returning());
        register(CustomerKind.FREQUENT,  new Frequent());
        register(CustomerKind.NEW,       new New());
        register(CustomerKind.VIP,       new Vip());
    }

    /**
     * This class method registers a customer based on customer type and strategy;
     * uses User Defined Map to put key-value pairs
     * @param kind Customer type - New, Business, Frequent, Returning, VIP
     * @param strategy object containing information on Interface methods to be implemented
     */
    public final void register(CustomerKind kind, TemplateStrategy strategy) {
        if (kind == null || strategy == null) {
            throw new IllegalArgumentException("kind/strategy must not be null");
        }
        strategies.put(kind, strategy);
    }

    /**
     * Composes email based on customer type and its corresponding strategy obtained from map
     * @param c Customer object containing name and kind details
     * @return Email object
     */
    public Email compose(Customer c) {
        TemplateStrategy s = strategies.get(c.getKind());
        if (s == null) {
            throw new IllegalStateException("No strategy for " + c.getKind());
        }
        return new Email(s.subjectFor(c), s.bodyFor(c));
    }
}

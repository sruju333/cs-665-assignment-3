/**
 * Name: SRUJANA NIRANJANKUMAR
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2025
 * File Name: TestEmailCustomer.java
 * Description: This file defines the test cases for TestEmailCustomer class to verify implementation
 */
package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This is TestEmailCustomer class
 */

public class TestEmailCustomer {

    @Test
    public void testEmailNewSubject(){
        MailEngine mailEngine = new MailEngine();
        Customer customer = new Customer("Bloom", CustomerKind.NEW);
        Email email = mailEngine.compose(customer);

        // Check if output contains Welcome in subject and doesn't contain Exclusive access
        assertTrue(email.getSubject().startsWith("Welcome Bloom"));
        assertFalse(email.getSubject().contains("Exclusive access"));
    }

    @Test
    public void testEmailVipBody(){
        MailEngine mailEngine = new MailEngine();
        Customer customer = new Customer("Stella", CustomerKind.VIP);
        Email email = mailEngine.compose(customer);

        // Check if output contains Dear and priority support in body and doesn't contain optimizations
        assertTrue(email.getBody().startsWith("Dear Stella"));
        assertTrue(email.getBody().contains("priority support"));
        assertFalse(email.getBody().contains("optimizations"));
    }

    @Test
    public void testCustomerObjectValues(){
        Customer customer = new Customer("Musa", CustomerKind.FREQUENT);

        assertEquals("Musa", customer.getName());
        assertEquals(CustomerKind.FREQUENT, customer.getKind());
    }

    @Test
    public void testReturningEmailFormatDiffersFromBusiness(){
        MailEngine mailEngine = new MailEngine();
        Customer c1 = new Customer("Techna", CustomerKind.BUSINESS);
        Customer c2 = new Customer("Layla", CustomerKind.RETURNING);
        Email email1 = mailEngine.compose(c1);
        Email email2 = mailEngine.compose(c2);

        assertNotEquals(true, email1.equals(email2));
        assertNotEquals(email1.getSubject(), "Returning and Business subjects should not be identical",
                email2.getSubject());
        assertNotEquals(email1.getBody(), "Returning and Business bodies should not be identical",
                email2.getBody());
    }

    @Test
    public void testBasicSanity(){
        MailEngine engine = new MailEngine();
        Customer c = new Customer("Ava Corp", CustomerKind.BUSINESS);

        Email email = engine.compose(c);
        assertNotNull(email);
        assertNotNull(email.getSubject());
        assertNotNull(email.getBody());
        assertFalse(email.getSubject().isEmpty());
        assertFalse(email.getBody().isEmpty());
        assertTrue(email.getSubject().endsWith("Ava Corp"));
    }
}

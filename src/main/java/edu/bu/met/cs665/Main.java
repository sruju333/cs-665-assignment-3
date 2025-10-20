/**
 * Name: SRUJANA NIRANJANKUMAR
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/20/2025
 * File Name: Main.java
 * Description: This Main class provides a command-line interface (CLI) that showcases the strategy pattern
 * illustrating how emails are personalized based on Customer Type.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.*;

import java.util.Scanner;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples through CLI.
   */
  public static void main(String[] args) {
      MailEngine engine = new MailEngine();

      Scanner sc = new Scanner(System.in);
      System.out.println("=== Email Generator ===");
      System.out.print("Enter customer name: ");
      String name = sc.nextLine().trim();

      System.out.println("Choose customer type:");
      for (CustomerKind k : CustomerKind.values()) {
          System.out.println(" - " + k.name());
      }
      System.out.print("Type one of the above exactly (e.g., NEW): ");
      String kindStr = sc.nextLine().trim();

      CustomerKind kind = CustomerKind.valueOf(kindStr.toUpperCase());
      Customer customer = new Customer(name, kind);
      Email email = engine.compose(customer);
      System.out.println();
      printEmail(email);
      sc.close();
  }

    /**
     * This method prints to console the Email Subject and Body relative to the Customer Type
     * @param email object containing email subject and body details
     */
    private static void printEmail(Email email) {
        System.out.println("---- Generated Email ----");
        System.out.println("Subject: " + email.getSubject() + "\n");
        System.out.println(email.getBody());
        System.out.println("-------------------------");
    }

}

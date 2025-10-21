
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | SRUJANA NIRANJANKUMAR      |
| Date         | 10/20/2025                 |
| Course       | Fall / Spring / Summer     |
| Assignment # | 3                          |

# Assignment Overview
This assignment implements an Email Generation application for a company that serves multiple customer segments - Business, Returning, Frequent, New, and VIP.
The goal is to automatically generate personalized email messages for each customer type based on a shared base template.
The key learning objective is to design a flexible and extensible object-oriented solution that applies a software design pattern (in this case, the Strategy Pattern) to separate the logic of email creation from the main execution flow.
Each customer type is handled by a separate class, making it easy to extend or modify the system without disrupting existing functionality. 
The application is tested through unit tests to demonstrate correct and distinct email outputs for each customer type.

# GitHub Repository Link:
https://github.com/sruju333/cs-665-assignment-3

# Implementation Description 


For each assignment, please answer the following:

- Explain the level of flexibility in your implementation, including how new object types can
be easily added or removed in the future.

This design is highly flexible. To add a new customer segment, such as “Premium”, a developer only needs to:
Create a new class (e.g., Premium) that implements TemplateStrategy.
Register it in the MailEngine constructor or dynamically at runtime.
No existing code in the context or other strategies needs to be modified. 
This demonstrates the Open/Closed Principle - the system is open for extension but closed for modification.
Similarly, strategies can be removed or swapped at runtime. 
For instance, unit tests can override a default strategy with a mock implementation to verify behavior dynamically.

- Discuss the simplicity and understandability of your implementation, ensuring that it is
easy for others to read and maintain.

The implementation uses straightforward Java constructs - classes, an interface, and an enum - without introducing unnecessary complexity.
Class and method names are self-explanatory (MailEngine, TemplateStrategy, CustomerKind, etc.), ensuring that the code can be easily understood by others or maintained in the future.
Each class has a single, clear responsibility:
Customer - represents the customer data.
Email - encapsulates the final output.
TemplateStrategy - defines the email creation contract.
Five concrete strategy classes (Business, Returning, Frequent, New, Vip) - provide the actual logic.
MailEngine - acts as the central coordinator or context.
Main - simple command-line client for user interaction.

- Describe how you have avoided duplicated code and why it is important.

Duplicate logic was intentionally avoided:
Common operations (such as creating and composing emails) are centralized inside the MailEngine context class.
Shared structure (subjectFor, bodyFor methods) is defined once in the interface and reused across strategies.
Repetition across email generation methods is limited to only what differs - the specific subject and body content per segment.
This minimizes redundancy and ensures that a change in one area (e.g., renaming a method or changing an output format) does not require updates across multiple files.

Avoiding duplicate code enhances maintainability, testability, and reduces the chance of inconsistencies or bugs caused by uncoordinated edits.

- If applicable, mention any design patterns you have used and explain why they were
chosen.

The Strategy Pattern was chosen because:
It matches the requirement for different behaviors per customer type while keeping a unified interface.
It promotes extensibility and code clarity.
It eliminates large if-else or switch statements that would otherwise be needed to handle each customer type.
It allows the system to dynamically select or replace the strategy at runtime (useful for testing or customization).
This pattern provides both structural and behavioral benefits, making it the most suitable design for the given problem statement.


# Maven Commands
## Compile
Type on the command line: 

```bash
mvn clean compile
```



## JUnit Tests
To run, use the following command:
```bash
mvn clean test
```


## Spotbugs
Use the following command:

```bash
mvn spotbugs:gui 
```


## Checkstyle
```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`





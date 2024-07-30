Open-Closed Principle:
======================

Definition:
===========
1. S/w components (classes, modules) should be open for extension and closed for modification.

Advantage:
==========
1. we can use third party libraries without worrying.
2. Flexibility
   Developers can add new features or modify existing ones without modifying existing code.
3. Scalability
   Developers can easily extend the functionality of their code as software requirements evolve.
4. Maintainability
   Developers can focus on understanding and improving specific aspects of the codebase without worrying about unintended consequences on other parts of the system.
5. Stability
   Existing, tested code remains untouched, reducing the risk of introducing bugs when adding new features.
6. Testability
   The use of interfaces and abstract classes make code more testable and ensure that the code is working correctly.
7. Modularity
   The need for changes to existing code when new features or functionality are added is reduced, making the code easier to maintain and scale

Examples:
==========
1. Internet brower + extensions
2. NotificationService class having a method sendOtp(String medium) if we want to use another medium e.g. sms then we need to modify the class. Solution is to have an interface and impls classes.


Solution Example: 
=================

InvoiceDao has saveToDB() method, if we want to saveToFile()
we need to change the existing class by adding one  more method >>> violates

We can create the interface InvoiceDao which has save() method,
any functionality should be created as new classes and implement the save() method


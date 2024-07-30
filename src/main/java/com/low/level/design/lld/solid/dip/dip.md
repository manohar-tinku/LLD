Dependency Inversion Principle
==============================

Definition:
===========
1. Class should depend on interfaces rather on concrete classes
2. States that we must use abstraction (abstract classes and interfaces) instead of concrete implementations.
3. High-level modules should not depend on the low-level module but both should depend on the abstraction

Advantages:
===========
1. Helps in removing hardcoded dependencies so that the application becomes loosely coupled
2. Increased flexibility: DIP creates a more adaptable design that can handle changes more easily.
3. Improved maintainability: DIP makes our code easier to maintain and update, as changes to one module do not require changes to other modules that depend on it.

Examples:
===========
1. Manager >> Team Lead >> Team
2. Instead of having two seperate classes DebitCard and CreditCard
   -- we can have one interface BankCard with doTranscationMethod() and DebitCard and CreditCard classess can implement BankCard
   -- so BankCard card = new DebitCard(); / new CreditCard();
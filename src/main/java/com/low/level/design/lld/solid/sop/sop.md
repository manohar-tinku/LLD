Single Responsibility Principle:
================================

Definition:
===========
1. Class should have only one reason to change
2. Class should have only one responsibility

Advantage:
===========
1. Less Test cases and less dependencies
2. Easy to maintain
3. Easy to understand

Examples:
==========
1: Class connects to db, read and write to file  << THis violates SR
2: BankService which performs withdraw, deposit, Print and send otp << THis violates SR



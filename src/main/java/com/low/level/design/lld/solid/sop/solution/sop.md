Single Responsibility Principle:

Class should have only one reason to change
Class should have only one responsibility

-- Example 1: Class connects to db, read and write to file  << THis violates SR
-- Example 2: BankService which performs withdraw, deposit, Print and send otp << THis violates SR
-- Advantage: Less Test cases and less dependencies


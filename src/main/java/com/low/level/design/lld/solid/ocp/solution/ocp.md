S/w components (classes, modules) should be open for extension and closed for modification.
-- Advatage: we can use third party libraries without worrying.
-- Example 1: Internet brower + extensions
-- Example 2: NotificationService class having a method sendOtp(String medium) if we want to use another medium e.g. sms then we need to modify the class. Solution is to have an interface and impls classes.


Solution Example: 

InvoiceDao has saveToDB() method, if we want to saveToFile()
we need to change the existing class by adding one  more method >>> violates

We can create the interface InvoiceDao which has save() method,
any functionality should be created as new classes and implement the save() method


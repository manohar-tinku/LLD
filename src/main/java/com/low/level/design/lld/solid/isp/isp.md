Interface Segregation Principle:
================================

Definition:
===========
1. Interfaces should be such, clients should not implement unnecessary functions that they do not want
2. Do not force any client to implement an interface which is irrelevant to them
3. applies to Interfaces instead of classes

Advantages:
===========
1. It Makes code more modular, reusable, and maintainable.
2. Reduces code complexity and makes it easier to understand and use.
3. Allows for easier addition or removal of features without impacting other parts of the system.

Examples:
==========
1. Hotel Menu, We can segregate the menu like veg, non-veg and jain food etc.
   -- instead of putting all menus which may be irrelevant to some clients.
2. Interface UPIPayments having methods pay(), getScratchCard(), getCashBack()
   -- lets say Google Pay supports all these but Paytm doesn't support getCashBack
   -- so we need to segregate interface e.g. interface CashbackManger having only getCashBack() method and based on need client 
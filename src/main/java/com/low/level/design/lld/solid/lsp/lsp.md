Liskov Substitution Principle
------------------------------
Definition:
===========
1. Derived classes or child classes must be substitutable for their bases or parent class without interupting the behaviour of program.
2. If Class B is subtype of Class A, then we should be able to replace object of A with B without breaking the behaviour of the program

Based on:
==========
This principle designed based on the inheritance concepts.

Advantage:
==========
1. This avoids misusing inheritance
2. Developers can achieve code reusability, maintainability, and flexibility

One more Example:
===============
1. abstact class SocialMedia with abstract methods or interface.
2. abstract methods are chat(), publishPost(), sendPhotoOrVideo()
3. Here Child classess can be Facebook, Whatsapp etc
4. Facebook is completly substitutable for socialMedia as it supports all features.
5. But Whatsapp is not because it doesnt support the publishPost() feature.


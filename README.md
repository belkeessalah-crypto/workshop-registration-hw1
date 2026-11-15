HW: Intermediate — Custom Checked Exceptions (Event Registration)
Concept: Creating custom checked exceptions, using throw and throws.
The Task
Imagine you are building an online registration system for an exclusive workshop.
Create a custom checked exception class named InvalidAgeException that extends Exception. It should accept a custom error message in its constructor.
1. Create a class called WorkshopRegistration with:
Bullet A method void registerParticipant(String name, int age) throws InvalidAgeException
1. Inside registerParticipant:
Bullet If age is less than 18, throw your InvalidAgeException with a message like "Registration denied for [Name]: Must be at least 18 years old (provided age: [Age]).".
Bullet Otherwise, print a success message confirming the participant's registration.
Testing Your Code
Write a Main class that attempts to register a 16-year-old participant inside a try-catch block, handles the custom exception appropriately, and prints the exception's message.

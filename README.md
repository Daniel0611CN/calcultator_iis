# JUnit 5 & Maven Learning Project

This project was created to test and understand the core concepts of **Unit Testing** using **JUnit 5**. 

### Objectives
This repository focuses on learning and applying the following technologies:
* **JUnit 5:** Writing and executing unit tests to ensure code quality.
* **Maven (`pom.xml`):** Managing project structure and downloading dependencies automatically.
* **Javadoc Plugin:** Generating automated and standardized documentation directly from the source code.

### What's inside?

* **`Calculator.java`**: A simple class containing the core logic for basic mathematical operations. It implements four methods: `add`, `subtract`, `multiply`, and `divide`.
* **`CalculatorTest.java`**: The unit testing class designed to verify the calculator's functionality and handle edge cases. It includes the following test methods:
  * `testAdd()`: Verifies that the addition operation returns the correct sum.
  * `testSubtract()`: Checks that the subtraction operation works as expected.
  * `testMultiply()`: Validates that the multiplication operation calculates the exact product.
  * `testDivide()`: Ensures that the division operation returns the proper quotient under normal conditions.
  * `testIllegalArgumentException()`: Verifies error handling for edge cases, specifically ensuring that the proper exception is thrown when attempting to divide by zero.

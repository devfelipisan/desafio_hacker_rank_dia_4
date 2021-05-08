# Day 4: Class vs. Instance
-------------------------------------
Day 4: Challenge Class vs. Instance

## Objective

In this challenge, we're going to learn about the difference between a class and an instance; because this is an Object Oriented concept

## Task
 
Write a Person class with an instance variable, __age__, and a constructor that takes an integer, __initialAge__, as a parameter. The constructor must assign __initialAge__ to __age__ after confirming the argument passed as __initialAge__ is not negative; if a negative argument is passed as __initialAge__, the constructor should set __age__ to and print . In addition, you must write the following instance methods:

1. __yearPasses()__ should increase the  instance variable by.1
2. amIOld() should perform the following conditional actions:
  - If __age < 13__, print . You are young.
  - If __age >= 13__ and __age < 18__ , print . You are a teenager.
  - Otherwise, print .You are old.

To help you learn by example and complete this challenge, much of the code is provided for you, but you'll be writing everything in the future. The code that creates each instance of your Person class is in the main method. Don't worry if you don't understand it all quite yet!

**Note:** Do not remove or alter the stub code in the editor.

## Input Format

Input is handled for you by the stub code in the editor.
The first line contains an integer, (the number of test cases), and the subsequent lines each contain an integer denoting the **TT age** of a Person instance.

## Constraints

- __1 <= T <= 4__
- __-5 <= age <= 30__

## Output Format
Complete the method definitions provided in the editor so they meet the specifications outlined above; the code to test your work is already in the editor.
If your methods are implemented correctly, each test case will print or lines (depending on whether or not a valid __23initialAge__ was passed to the constructor).

## Sample input

```
4
-1
10
16
18
```

## Sample Output

```
Age is not valid, setting age to 0.
You are young.
You are young.

You are young.
You are a teenager.

You are a teenager.
You are old.

You are old.
You are old.
```
## Explanation
- **Test Case 0:** __initialAge = -1__
Because __initialAge < 0__, our code must set __age__ to and print the "Age is not valid..." message followed by the young message.
Three years pass and ___age = 3__, so we print the young message again.

- **Test Case 1:** __initialAge = 10__
Because __initialAge < 13__, our code should print that the person is young. Three years pass and __age = 13__, so we print that the person is now a teenager.

- **Test Case 2:** __initialAge = 16__
Because __13 <= initialAge < 18__, our code should print that the person is a teenager. Three years pass and __age = 19__, so we print that the person is old.

- **Test Case 3:** __initialAge = 18__
Because __initialAge >= 18__, our code should print that the person is old. Three years pass and the person is still old at __age = 21__, so we print the old message again.

**The extra line at the end of the output is supposed to be there and is trimmed before being compared against the test case's expected output. If you're failing this challenge, check your logic and review your print statements for spelling errors.**

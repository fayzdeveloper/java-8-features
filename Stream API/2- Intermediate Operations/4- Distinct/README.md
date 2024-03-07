# Java Stream API - Distinct Method

This README provides an in-depth guide to the `distinct` method in the Java Stream API.

## Table of Contents

- [Introduction](#introduction)
- [Syntax](#syntax)
- [Description](#description)
- [Example: Distinct Integers](#example-distinct-integers)
- [Example: Distinct Objects](#example-distinct-objects)
- [Common Use Cases](#common-use-cases)
- [Important Points](#important-points)
- [Coding Challenges](#coding-challenges)

## Introduction

The `distinct` method is an intermediate operation in the Java Stream API that removes duplicate elements from a stream, producing a new stream with unique elements.

## Syntax

The basic syntax of the `distinct` method is as follows:

```java
Stream<T> distinct()

T: The type of elements in the stream.

```

## Description
The distinct method is used to eliminate duplicate elements from a stream, ensuring that each element in the resulting stream is unique.

## Example: Distinct Integers
Suppose you have a list of integers with duplicates, and you want to create a new list with only the unique integers. You can use the distinct method as follows:

```
List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 4, 6, 7, 8, 7);

List<Integer> uniqueNumbers = numbers.stream()
                                     .distinct()
                                     .collect(Collectors.toList());

System.out.println(uniqueNumbers); // Output: [1, 2, 3, 4, 5, 6, 7, 8]

```
In this example, the distinct method is used to create a new list with only the unique integers from the original list.

## Example: Distinct Objects
Let's consider a list of custom objects representing people, and you want to create a new list with only distinct ages:

```
class Person {
    String name;
    int age;
    // Constructor and other methods omitted for brevity
}

List<Person> people = Arrays.asList(
        new Person("Alice", 25),
        new Person("Bob", 30),
        new Person("Charlie", 22),
        new Person("David", 25)
);

List<Integer> distinctAges = people.stream()
                                   .map(person -> person.age)
                                   .distinct()
                                   .collect(Collectors.toList());

System.out.println(distinctAges); // Output: [25, 30, 22]

```
In this example, the distinct method is used to create a new list with only the distinct ages from the original list of Person objects.

## Common Use Cases
### Removing Duplicates: Use distinct to filter out duplicate elements from a stream.
### Ensuring Uniqueness: Ensure that elements in a stream are unique based on specific criteria.

## Important Points
### The distinct method uses the equals method to determine whether two elements are distinct.
### It's a lazy operation, meaning it doesn't execute immediately but waits for a terminal operation to trigger the processing of the stream.
### The order of elements in the resulting stream may not be the same as the original order.

## Coding Challenges
Challenge 1: Distinct Strings: 
Write a method that takes a list of strings and returns a new list containing only distinct strings.

Challenge 2: Distinct Employees: 
Create a class Employee with attributes id and name. Write a method that takes a list of employees and returns a new list containing only distinct employees based on their id.

Challenge 3: Distinct Prime Numbers: 
Write a method that takes a list of integers and returns a new list containing only distinct prime numbers.

Challenge 4: Distinct Students by GPA: 
Create a class Student with attributes name and gpa. Write a method that takes a list of students and returns a new list containing only distinct students based on their gpa.

Challenge 5: Distinct Files by Extension: 
Write a method that takes a list of file names and returns a new list containing only distinct file names based on their extensions.
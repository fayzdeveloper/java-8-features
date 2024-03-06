# Java Stream API - Filter Method

This README provides an in-depth guide to the `filter` method in the Java Stream API. The `filter` method is an intermediate operation that allows you to selectively include or exclude elements from a stream based on a specified condition.

## Table of Contents

- [Introduction](#introduction)
- [Syntax](#syntax)
- [Description](#description)
- [Example: Filtering Integers](#example-filtering-integers)
- [Example: Filtering Objects](#example-filtering-objects)
- [Common Use Cases](#common-use-cases)
- [Important Points](#important-points)
- [When to Use](#when-to-use)
- [Contributing](#contributing)
- [License](#license)
- [Acknowledgments](#acknowledgments)

## Introduction

The `filter` method is a crucial intermediate operation in the Java Stream API, allowing you to apply conditions to filter elements within a stream. This guide covers the syntax, description, examples, common use cases, and important considerations related to the `filter` method.

## Syntax
stream.filter(predicate)

## Description

The filter method is used to evaluate a specified condition (predicate) for each element in a stream. Only the elements that satisfy the condition will be included in the resulting stream.

## Example: Filtering Integers
Suppose you have a list of integers, and you want to filter out only the even numbers. Here's an example:

```
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

List<Integer> evenNumbers = numbers.stream()
                                    .filter(num -> num % 2 == 0)
                                    .collect(Collectors.toList());

System.out.println(evenNumbers); // Output: [2, 4, 6, 8, 10]

```

In this example, the filter method checks if each number is even (divisible by 2), and only the even numbers are included in the evenNumbers list.

## Example: Filtering Objects
Let's consider a list of custom objects representing people, and you want to filter out only adults (age greater than or equal to 18):

```
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

List<Person> people = Arrays.asList(
        new Person("Alice", 25),
        new Person("Bob", 17),
        new Person("Charlie", 30),
        new Person("David", 15)
);

List<Person> adults = people.stream()
                            .filter(person -> person.age >= 18)
                            .collect(Collectors.toList());

System.out.println(adults);

```
In this example, the filter method is used to include only those Person objects whose age is 18 or older.

## Common Use Cases

# Filtering Objects:
    #Filtering a list of objects based on certain criteria.

# Removing Null or Empty Elements:
    #Filtering out null or empty elements from a stream.

# Conditional Filtering:
    #Applying complex conditions to filter elements based on specific requirements.

## Important Points
# The filter method doesn't modify the original stream; it creates a new stream with the filtered elements.
# It's a lazy operation, meaning it doesn't execute immediately but waits for a terminal operation to trigger the processing of the stream.

## When to Use
# Use the filter method when you need to selectively include or exclude elements from a stream based on a specified condition.
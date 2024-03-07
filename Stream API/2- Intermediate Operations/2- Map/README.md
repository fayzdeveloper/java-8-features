# Java Stream API - Map Method

This README provides an in-depth guide to the `map` method in the Java Stream API.

## Table of Contents

- [Introduction](#introduction)
- [Syntax](#syntax)
- [Description](#description)
- [Example: Mapping Integers](#example-mapping-integers)
- [Example: Mapping Objects](#example-mapping-objects)
- [Common Use Cases](#common-use-cases)
- [Important Points](#important-points)
- [Coding Challenges](#coding-challenges)

## Introduction

The `map` method is an intermediate operation in the Java Stream API that allows you to transform each element of the stream using a provided function. It produces a new stream where each element is the result of applying the given function to the corresponding element of the original stream.

## Syntax

The basic syntax of the `map` method is as follows:

```
Stream<T> map(Function<? super T, ? extends R> mapper)

T: The type of the input elements in the stream.
R: The type of the result elements in the new stream.
mapper: The function to apply to each element.

```

## Description
The map method is used to apply a specified function to each element in a stream, producing a new stream with the transformed elements.

## Example: Mapping Integers
Suppose you have a list of integers, and you want to create a new list with each element squared. You can use the map method as follows:

```
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

List<Integer> squaredNumbers = numbers.stream()
                                      .map(x -> x * x)
                                      .collect(Collectors.toList());

System.out.println(squaredNumbers); // Output: [1, 4, 9, 16, 25]

```
In this example, the map method is used to square each element in the stream, resulting in a new list of squared numbers.

## Example: Mapping Objects
Let's consider a list of custom objects representing people, and you want to create a new list with only the names:

```
class Person {
    String name;
    int age;
    // Constructor and other methods omitted for brevity
}

List<Person> people = Arrays.asList(
        new Person("Alice", 25),
        new Person("Bob", 30),
        new Person("Charlie", 22)
);

List<String> names = people.stream()
                           .map(person -> person.name)
                           .collect(Collectors.toList());

System.out.println(names); // Output: [Alice, Bob, Charlie]

```
In this example, the map method is used to extract the name property from each Person object, resulting in a new list of names.

## Common Use Cases
### Data Transformation: Use map to transform elements into another type or modify their attributes.
### Extracting Information: Extract specific information or properties from complex objects.
### Converting Types: Convert elements from one type to another using a mapping function.

## Important Points
### The map method doesn't modify the original stream; it creates a new stream with the transformed elements.
### It's a lazy operation, meaning it doesn't execute immediately but waits for a terminal operation to trigger the processing of the stream.

## Coding Challenges
Challenge 1: Map to Uppercase: 
Write a method that takes a list of strings and returns a new list containing each string converted to uppercase.

Challenge 2: Map to Length: 
Write a method that takes a list of strings and returns a new list containing the length of each string.

Challenge 3: Map to Square Roots: 
Write a method that takes a list of doubles and returns a new list containing the square root of each double.

Challenge 4: Map to Initials: 
Create a class Person with attributes firstName and lastName. Write a method that takes a list of Person objects and returns a new list containing the initials (first letter of first name + first letter of last name) of each person.

Challenge 5: Map to String Lengths: 
Write a method that takes a list of strings and returns a new list containing the lengths of the strings as strings (e.g., ["apple", "banana"] -> ["5", "6"]).

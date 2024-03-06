# Intermediate Operations in Java Streams

This README provides a comprehensive tutorial on intermediate operations in Java Streams. Intermediate operations transform existing streams into new streams, allowing for powerful data processing pipelines.

## Table of Contents

- [Introduction](#introduction)
- [List of Intermediate Operations](#list-of-intermediate-operations)
  - [Filter](#filter)
  - [Map](#map)
  - [FlatMap](#flatmap)
  - [Distinct](#distinct)
  - [Sorted](#sorted)
  - [Peek](#peek)
  - [Limit](#limit)
  - [Skip](#skip)
  - [TakeWhile](#takewhile)
  - [DropWhile](#dropwhile)
  - [FilterNot](#filternot)
  - [MapToInt, MapToDouble, MapToLong](#maptoint-maptodouble-maptolong)

## Introduction

Java Streams provide a powerful and expressive way to process collections of data. Intermediate operations are essential for transforming and filtering the data within a stream before applying terminal operations.

## List of Intermediate Operations

### Filter


stream.filter(predicate)

### Map
Transforms each element of the stream using the provided function.
    `Syntax` : stream.map(mapper)

### FlatMap
Transforms each element of the stream into a stream of other objects and then flattens the resulting streams into a single stream.
    `Syntax` : stream.flatMap(mapper)

### Distinct
Returns a stream of distinct elements based on their natural order or using a provided comparator.
    `Syntax` : stream.distinct()

### Sorted
Returns a stream sorted according to natural order or using a provided comparator.
    `Syntax` : stream.sorted()

### Peek
Returns a stream consisting of the elements of the original stream, additionally performing the provided action on each element.
    `Syntax` : stream.peek(action)

### Limit
Returns a stream consisting of the elements of the original stream, truncated to be no longer than the specified size.
    `Syntax` : stream.limit(maxSize)
    
### Skip
Returns a stream consisting of the remaining elements of the original stream after discarding the first n elements.
    `Syntax` : stream.skip(n)

### TakeWhile
Returns a stream consisting of the longest prefix of elements that match the given predicate.
    `Syntax` : stream.takeWhile(predicate)

### DropWhile
Returns a stream consisting of the remaining elements of the stream after dropping the longest prefix of elements that match the given predicate.
    `Syntax` : stream.dropWhile(predicate)

### FilterNot
Returns a new stream consisting of elements that do not match the given predicate.
    `Syntax` : stream.filterNot(predicate)

### MapToInt, MapToDouble, MapToLong
Specialized map operations to transform elements into primitive types.
    `Syntax` : 'stream.mapToInt(mapper)', 'stream.mapToDouble(mapper)', 'stream.mapToLong(mapper)'




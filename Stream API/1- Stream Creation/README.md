## 1- Stream Creation

Creating streams in Java 8 involves several methods. Here are different ways to `create streams`:

1- `Create a Stream from a Collection:`
    You can convert collections (e.g., List, Set) into streams using the stream() method.

    ```
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    Stream<Integer> numbersStream = numbers.stream();
    ```

2- `Create a Stream from an Array`:
    You can create streams directly from arrays using the Arrays.stream() method. 

    ```
    String[] array = {"apple", "banana", "orange"};
    Stream<String> arrayStream = Arrays.stream(array);
    ```
3- `Generate a Stream using Stream.of()`:
    You can use Stream.of() to create a stream of elements directly.

    ```
    Stream<String> stringStream = Stream.of("apple", "banana", "orange");

    ```
4- `Generate a Stream using Stream.iterate()`:
    You can use Stream.iterate() to generate an infinite stream based on a seed and a function.

    ```
    Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 2);

    ```
5- `Generate a Stream using Stream.generate()`:
    You can use Stream.generate() to generate an infinite stream based on a supplier.

    ```
    Stream<String> infiniteStringStream = Stream.generate(() -> "hello");

    ```
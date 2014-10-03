
(params) -> expression
(params) -> statement
(params) -> { statements }

Map

IntStream.iterate(1, i -> i + 2);  // Infinite iterator
IntStream.iterate(0, i -> i + 2).limit(10).forEach(System.out::println);

List<String> features = ...
features.forEach(n -> System.out.println(n));
features.forEach(System.out::println);

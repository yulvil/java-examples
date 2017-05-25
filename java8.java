
(params) -> expression
(params) -> statement
(params) -> { statements }

Map

IntStream.iterate(1, i -> i + 2);  // Infinite iterator
IntStream.iterate(0, i -> i + 2).limit(10).forEach(System.out::println);
int sum = IntStream.of(a).sum();

List<String> features = ...
features.forEach(n -> System.out.println(n));
features.forEach(System.out::println);


// Design Patterns in the Light of Lambda Expressions by Subramaniam
// Execute Around Method Pattern
class Resource {
	private Resource() {}
	public Resource op1() {return this;}
	public Resource op2() {return this;}
	private void close() {}
	public static void use(Consumer<Resource> block) {
		Resource resource = new Resource();
		try {
			block.accept(resource);
		} finally {
			resource.close();
		}
	}
}

Resource.use(resource -> resource.op1().op2());

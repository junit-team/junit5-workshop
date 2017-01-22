slidenumbers: true

# Dynamic Tests

![fit right 350%](../junit5.png)

---

# Static Tests

```java
class StandardTests {

	@Test
	void succeedingTest() {
	}

	@Test
	void failingTest() {
		fail("a failing test");
	}

	@Test
	@Disabled("for demonstration purposes")
	void skippedTest() {
		// not executed
	}
}
```

---

![fit](static_tests_1.png)
![fit](static_tests_2.png)
![fit](static_tests_3.png)

---

# Static Tests

- fully specified at compile time
- no way to programmatically add tests at runtime

---

# Dynamic Tests

```java
class DynamicTestsDemo {
	@TestFactory
	Stream<DynamicTest> dynamicTestsFromIntStream() {
		return IntStream.iterate(0, n -> n + 2).limit(10).mapToObj(
			n -> dynamicTest("test" + n, () -> {
				assertTrue(n % 2 == 0);
			}));
	}
}
```

`@TestFactory` method must return a `Stream`, `Collection`, `Iterable`, or `Iterator` of `DynamicTest` instances.

---

![fit](dynamic_tests_1.png)
![fit](dynamic_tests_2.png)
![fit](dynamic_tests_3.png)

---

# Why Dynamic Tests?

Use plain old Java and lambdas to generate _dynamic_ tests at runtime

- for a set of parameters
- based on data in other files
- using random data
- using environment variables
- depending on the operating system
- etc.

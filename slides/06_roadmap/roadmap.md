slidenumbers: true

# Roadmap

![](https://pixabay.com/get/ed30b4082efd1c22d2524518a33219c8b66ae3d111b413449df1c67e/map-455769_1280.jpg)

---

# [fit] Roadmap to GA[^1]

- **5.0.0-M4** (March 2017): Parameterized tests
- **5.0.0-M5** (June 2017): Java 9 Compatibility
- **5.0.0-RC1** (July 2017): Fixes before GA
- **5.0.0** (August 2017): GA

![right](https://pixabay.com/get/ed30b4082efd1c22d2524518a33219c8b66ae3d111b413449df1c67e/map-455769_1280.jpg)

[^1]: Subject to change 😉

---

# Sneak Preview

![](https://pixabay.com/get/e830b40929f3063ed1584d05fb0938c9bd22ffd41db9144393f0c17dae/mountain-road-1556177_1280.jpg)

---

# `@TestTemplate` (slated for M4)

```java
class MyTest {
	@TestTemplate @ExtendWith(MyTestTemplateInvocationContextProvider.class)
	void testTemplate() {
		// test something
	}
}

class MyTestTemplateInvocationContextProvider
		implements TestTemplateInvocationContextProvider {
	@Override public Iterator<TestTemplateInvocationContext> provide(
			ContainerExtensionContext context) {
		return singletonIterator(new MyTestTemplateInvocationContext());
	}
}

class MyTestTemplateInvocationContext implements TestTemplateInvocationContext {
	@Override public String getDisplayName(int invocationIndex) {
		return "[" + invocationIndex + "]";
	}
	@Override public List<Extension> getAdditionalExtensions() {
		return asList(new MyParameterResolver(), new MyTestInstancePostProcessor(), ...);
	}
}
```

---

# `@ParameterizedTest` (slated for M4)[^2]

```java
class ParameterizedTests {
	@ParameterizedTest @StringSource({ "foo, 1", "bar, 2" })
	void testWithParametersFromAnnotation(String parameter, int i) {
		// test something
	}

	@ParameterizedTest @MethodSource("providerMethod")
	void testWithParametersFromMethods(String parameter) {
	}
	static Iterable<String> providerMethod() { return asList("foo", "bar"); }

	@ParameterizedTest @FileSource("foo.csv") @FileSource("bar.csv")
	void testWithParametersFromFile(String parameter) {
	}
}
```

[^2]: More examples: <https://github.com/junit-team/junit5/blob/issues/14-params-experiments/junit-jupiter-params/src/test/java/org/junit/jupiter/params/ParamsApiPlayground.java#L25>

---

# `@ScenarioTest` (M5 or 5.1+)[^3]

```java
@ScenarioTest
class WebSecurityScenarioTest {

    @Step(next = "login")
    void visitPageRequiringAuthorizationWhileNotLoggedIn() {
        // attempt to visit page which requires that a user is logged in
    }
    @Step(next = "visitSecondPageRequiringAuthorizationWhileLoggedIn")
    void login() {
        // submit login form with valid credentials
    }
    @Step(next = "logout")
    void visitSecondPageRequiringAuthorizationWhileLoggedIn() {
        // visit another page which requires that a user is logged in
    }
    @Step(next = END)
    void logout() {
        // visit logout URL
    }
}
```

[^3]: Syntax will probably change, see <https://github.com/junit-team/junit5/issues/48> for details

---

# [fit] Feedback wanted!

Website (User Guide & Javadoc):
[junit.org/junit5/](http://junit.org/junit5/)

Code & Issues:
[github.com/junit-team/junit5/](https://github.com/junit-team/junit5/)

Twitter:
[twitter.com/junitteam/](https://twitter.com/junitteam/)

![right 400%](../junit5.png)

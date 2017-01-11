# JUnit 5 Workshop

Slides, examples, and exercises for a JUnit 5 Workshop, initially held by [Marc Philipp](http://twitter.com/marcphilipp) and [Nicolai Parlog](https://twitter.com/nipafx) at [JUG Karlsruhe on January 25th 2017](http://jug-karlsruhe.de/content/junit-workshop/).

## Outline

1. introduction (Nicolai, 45 minutes)
    * [setup](#setup)
    * [basic features](https://codefx-org.github.io/talk-junit-5/#/_basics) (`@Test`, lifecycle, ...)
    * simple [tasks](src/test/java/org/junit/junit5workshop/_1_basics) to write some tests
2. dynamic test (Marc, 30 minutes)
    * exercise to create dynamic tests
3. extension mechanism ([theory](https://codefx-org.github.io/talk-junit-5/#/_extensions); Nicolai, 15 minutes)

30 minute break

4. extension mechanism ([practice](src/test/java/org/junit/junit5workshop/_3_extensions,) Nicolai, 30 minutes)
5. architecture. modularization, side-by-side use of JUnit 4 and 5 (Marc, 15 minutes)
6. roadmap to GA (Marc, 10 minutes)
7. Q & A & more hacking, open end...

## Setup

First, clone the project:

```bash
git clone https://github.com/junit-team/junit5-workshop.git
```

JUnit-5-specific plugins for **Maven** Surefire and **Gradle** are included in the project's `pom.xml` and `build.gradle` so both tools work without additional setup.
Try it with `mvn clean test` or `gradle test`. Alternatively, you can use the provided Gradle or Maven wrappers with `./mvnw clean test` or `./gradlew test`.

**IntelliJ** is the first (and so far only) tool that has native support and everything should work out of the box.
Since this project uses JUnit 5 Milestone 3 [2016.3.1](https://blog.jetbrains.com/idea/2016/12/intellij-idea-2016-3-1-rc-updates-junit-5-support-to-m3/) is required to run the tests.

**Eclipse** requires a little fiddling to get to work but it is possible with 4.7 M4, following [these steps](https://bugs.eclipse.org/bugs/show_bug.cgi?id=488566#c8).

package org.junit.junit5workshop._1_basics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("A stack")
class _5_NestedAndNamedTest {

	/*
	 * Demonstration of JUnit 5 features (particularly nesting and naming)
	 * that was taken from the JUnit 5 User Guide
	 * (http://junit.org/junit5/docs/5.0.0-M4/user-guide/#writing-tests-nested)
	 */

	Stack<Object> stack;

	@Test
	@DisplayName("is instantiated with new Stack()")
	void isInstantiatedWithNew() {
		new Stack<>();
	}

	@Nested
	@DisplayName("when new")
	class WhenNew {

		@BeforeEach
		void createNewStack() {
			stack = new Stack<>();
		}

		@Test
		@DisplayName("is empty")
		void isEmpty() {
			assertTrue(stack.isEmpty());
		}

		@Test
		@DisplayName("throws EmptyStackException when popped")
		void throwsExceptionWhenPopped() {
			assertThrows(EmptyStackException.class, () -> stack.pop());
		}

		@Test
		@DisplayName("throws EmptyStackException when peeked")
		void throwsExceptionWhenPeeked() {
			assertThrows(EmptyStackException.class, () -> stack.peek());
		}

		@Nested
		@DisplayName("after pushing an element")
		class AfterPushing {

			String anElement = "an element";

			@BeforeEach
			void pushAnElement() {
				stack.push(anElement);
			}

			@Test
			@DisplayName("it is no longer empty")
			void isNotEmpty() {
				assertFalse(stack.isEmpty());
			}

			@Test
			@DisplayName("returns the element when popped and is empty")
			void returnElementWhenPopped() {
				assertEquals(anElement, stack.pop());
				assertTrue(stack.isEmpty());
			}

			@Test
			@DisplayName("returns the element when peeked but remains not empty")
			void returnElementWhenPeeked() {
				assertEquals(anElement, stack.peek());
				assertFalse(stack.isEmpty());
			}
		}
	}

}

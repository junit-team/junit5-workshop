package org.junit.junit5workshop.extensions;

class BenchmarkExtension {

	/*
	 * Requirements:
	 *  - if applied to a test, it will report the run time of the individual
	 *    test without before and after behavior.
	 *  - if applied to a class, it will report the cumulated run time
	 *    of all tests therein (but not those of the individual tests)
	 *
	 * Tips:
	 *  - extend BeforeAllCallback, BeforeTestExecutionCallback,
	 *           AfterTestExecutionCallback, AfterAllCallback
	 *  - stateless
	 *  - use context and reflection to see whether class/method is annotated
	 */

}

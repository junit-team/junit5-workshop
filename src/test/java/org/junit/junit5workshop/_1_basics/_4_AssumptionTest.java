package org.junit.junit5workshop._1_basics;

import java.time.LocalDateTime;

class _4_AssumptionTest {

	/*
	 * Write tests that use assumptions to make sure
	 * tests are only executed when preconditions are fulfilled.
	 *
	 *  - assumeTrue
	 *  - assumeFalse
	 *  - assumeThat
	 */

	private String messageBeforeNoon() {
		if (LocalDateTime.now().getHour() < 12)
			return "Good Morning";
		else
			throw new IllegalStateException();
	}

	private String messageAfterNoon() {
		if (LocalDateTime.now().getHour() > 12)
			return "Good Evening";
		else
			throw new IllegalStateException();
	}

}

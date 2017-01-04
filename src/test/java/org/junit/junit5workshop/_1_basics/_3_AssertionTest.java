package org.junit.junit5workshop._1_basics;

public class _3_AssertionTest {

	/*
	 * Write tests that use a couple of basic assertions:
	 *
	 *  - assertTrue, assertFalse (including the variants taking suppliers)
	 *  - assertNull, assertNotNull (without messages, with message, and with lazy message)
	 *  - assertEquals, assertNotEquals
	 *  - assertSame, assertNotSame
	 *
	 * Write tests that use the collection assertions:
	 *
	 *  - assertArrayEquals, assertIterableEquals
	 *
	 * Write tests using some of the more advanced assertions:
	 *
	 *  - assertThrows
	 *  - assertTimeout, assertTimeoutPreemptively
	 *  - assertAll
	 *
	 * Tests can be failed manually with `fail`.
	 */

	private boolean truism() {
		return true;
	}

	private void throwing() throws Exception {
		throw new RuntimeException("Because I can!");
	}

}

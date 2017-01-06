package org.junit.junit5workshop.extensions;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

@Target({ TYPE, METHOD, ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface DisabledOnOs {

	OS[] value();

	enum OS {

		/*
		 * This class was written for demonstration purposes.
		 * It is not at all fit for production!
		 */

		NIX,
		MAC,
		WINDOWS;

		public static OS determine() {
			String os = System.getProperty("os.name").toLowerCase();

			if (isWindows(os)) {
				return WINDOWS;
			} else if (isMac(os)) {
				return MAC;
			} else if (isUnix(os)) {
				return NIX;
			} else {
				throw new IllegalArgumentException("Unknown OS \"" + os + "\".");
			}
		}

		private static boolean isWindows(String os) {
			return os.contains("win");
		}

		private static boolean isMac(String os) {
			return os.contains("mac");
		}

		private static boolean isUnix(String os) {
			return os.contains("nix") || os.contains("nux");
		}

	}
}

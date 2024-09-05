package com.github.tantalor93;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import com.github.tantalor93.lastwordlength.Solution58;

class lengthLastWordTest {

	@ParameterizedTest
	@MethodSource("parameters")
	void name(String input, int expected) {
		Assertions.assertThat(Solution58.lengthOfLastWord(input)).isEqualTo(expected);
	}

	static Object[][] parameters() {
		return new Object[][] {
				{ "Hello World", 5 },
				{ "   fly me   to   the moon  ", 4 },
				{ "luffy is still joyboy", 6 }
		};
	}
}

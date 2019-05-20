package com.woowacourse.stringadder

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException

class StringParserTest {
    @Test
    fun parseCommaSeparated() {
        assertThat(StringParser.parse("1,2,3"))
            .containsExactly(PositiveInteger(1), PositiveInteger(2), PositiveInteger(3))
    }

    @Test
    fun parseColonSeparated() {
        assertThat(StringParser.parse("1:2:3"))
            .containsExactly(PositiveInteger(1), PositiveInteger(2), PositiveInteger(3))
    }

    @Test
    fun parseComplexDefaultDelimiters() {
        assertThat(StringParser.parse("1,2:3"))
            .containsExactly(PositiveInteger(1), PositiveInteger(2), PositiveInteger(3))
    }

    @Test
    fun parseCustomDelimiter() {
        assertThat(StringParser.parse("//!\n1!2!3"))
            .containsExactly(PositiveInteger(1), PositiveInteger(2), PositiveInteger(3))
    }

    @Test
    fun parseCustomDelimiterWithRegexChar() {
        assertThat(StringParser.parse("//*\n1*2*3"))
            .containsExactly(PositiveInteger(1), PositiveInteger(2), PositiveInteger(3))
        assertThat(StringParser.parse("//.\n1.2.3"))
            .containsExactly(PositiveInteger(1), PositiveInteger(2), PositiveInteger(3))
    }

    @Test
    fun parseLongCustomDelimiter() {
        assertThat(StringParser.parse("//abc\n1abc2abc3"))
            .containsExactly(PositiveInteger(1), PositiveInteger(2), PositiveInteger(3))
    }

    @Test
    fun parseSegmentIncludesSpace() {
        assertThat(StringParser.parse("1, 2, 3"))
            .containsExactly(PositiveInteger(1), PositiveInteger(2), PositiveInteger(3))
        assertThat(StringParser.parse("//abc\n1 abc 2abc3"))
            .containsExactly(PositiveInteger(1), PositiveInteger(2), PositiveInteger(3))
    }

    @Test
    fun parseCustomDelimiterIsNumber() {
        assertThat(StringParser.parse("//123\n1 123 21233"))
            .containsExactly(PositiveInteger(1), PositiveInteger(2), PositiveInteger(3))
    }

    @Test
    fun invalidCustomDelimiterBeginning() {
        assertThrows(IllegalArgumentException::class.java) {
            StringParser.parse("/!\n1!2!3")
        }
    }
}
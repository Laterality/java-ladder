package com.woowacourse.stringadder

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException

class PositiveIntegerTest {
    @Test
    fun create() {
        assertThat(PositiveInteger(2)).isEqualTo(PositiveInteger(2))
    }

    @Test
    fun createZero() {
        assertThat(PositiveInteger(0)).isEqualTo(PositiveInteger(0))
    }

    @Test
    fun createNegative() {
        assertThrows(IllegalArgumentException::class.java) {
            PositiveInteger(-3)
        }
    }
}
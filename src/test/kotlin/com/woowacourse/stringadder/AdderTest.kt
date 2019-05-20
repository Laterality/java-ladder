package com.woowacourse.stringadder

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.util.*

class AdderTest {
    @Test
    fun add() {
        assertThat(PositiveIntegerAdder.add(Arrays.asList(PositiveInteger(1), PositiveInteger(2),
            PositiveInteger(3), PositiveInteger(4))))
            .isEqualTo(PositiveInteger(10))
    }
}
package com.woowacourse.stringadder

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PositiveIntegerAdderControllerTest {
    @Test
    fun sumWithDefaultDelimiter() {
        assertThat(StringAdderController.sum("1, 2:3,4 :5").toString()).isEqualTo("15")
    }
}
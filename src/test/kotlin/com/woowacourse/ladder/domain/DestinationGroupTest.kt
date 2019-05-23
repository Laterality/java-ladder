package com.woowacourse.ladder.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

class DestinationGroupTest {
    @Test
    fun create() {
        assertThat(DestinationGroup("1st, 2nd, 3rd")).isEqualTo(DestinationGroup("1st,2nd,3rd"))
    }

    @Test
    fun emptySegment() {
        assertThrows(IllegalArgumentException::class.java) {
            DestinationGroup("1st,, 3rd")
        }
    }

    @Test
    fun spaceSegment() {
        assertThrows(IllegalArgumentException::class.java) {
            DestinationGroup("1st,, ")
        }
    }
}
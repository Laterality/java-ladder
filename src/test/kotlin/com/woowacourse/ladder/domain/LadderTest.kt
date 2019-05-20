package com.woowacourse.ladder.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.util.*

class LadderTest {
    @Test
    fun match() {
        val state = LadderState(3, 3, TestBooleanGenerator(Arrays.asList(true, false, false, true, true, false)))
        val result = Ladder.match(state, Arrays.asList("pobi", "crong", "honux"), Arrays.asList("1st", "2nd", "3rd"))
        assertThat(result.getMatchDestination("pobi")).isEqualTo("3rd")
        assertThat(result.getMatchDestination("crong")).isEqualTo("2nd")
        assertThat(result.getMatchDestination("honux")).isEqualTo("1st")

    }
}
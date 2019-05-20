package com.woowacourse.ladder.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LadderResultPairTest {
    @Test
    fun getMatch() {
        val result = LadderResultPair()
        result.addPair("pobi", "3rd")
        result.addPair("crong", "2nd")
        result.addPair("honux", "1st")
        assertThat(result.getMatchDestination("pobi")).isEqualTo("3rd")
        assertThat(result.getMatchDestination("crong")).isEqualTo("2nd")
        assertThat(result.getMatchDestination("honux")).isEqualTo("1st")

    }
}
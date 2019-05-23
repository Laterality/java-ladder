package com.woowacourse.ladder.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DestinationTest {
    @Test
    fun create() {
        assertThat(Destination("1st")).isEqualTo(Destination("1st"))
    }

    @Test
    fun spacePrefixSuffix() {
        assertThat(Destination("1st  ")).isEqualTo(Destination("1st"))
    }

    @Test
    fun convertToString() {
        assertThat(Destination("2nd").toString()).isEqualTo("2nd")
    }
}
package com.woowacourse.ladder.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

class ParticipantGroupTest {
    @Test
    fun create() {
        assertThat(ParticipantGroup("pobi, crong,honux ")).isEqualTo(ParticipantGroup("pobi,crong,honux"))
    }

    @Test
    fun emptySegment() {
        assertThrows(IllegalArgumentException::class.java) {
            ParticipantGroup("pobi,,crong")
        }
    }

    @Test
    fun spacePrefixAndSuffix() {
        assertThat(ParticipantGroup("pobi, crong          ,          honux ")).isEqualTo(ParticipantGroup("pobi,crong,honux"))
    }

    @Test
    fun emptyString() {
        assertThrows(IllegalArgumentException::class.java) {
            ParticipantGroup("")
        }
    }
}
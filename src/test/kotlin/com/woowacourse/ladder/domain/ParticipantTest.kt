package com.woowacourse.ladder.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

class ParticipantTest {
    @Test
    fun create() {
        assertThat(Participant("pobi")).isEqualTo(Participant("pobi"))
    }

    @Test
    fun emptyName() {
        assertThrows(IllegalArgumentException::class.java) {
            Participant("")
        }
    }

    @Test
    fun overLength() {
        assertThrows(IllegalArgumentException::class.java) {
            Participant("thesix")
        }
    }

    @Test
    fun trim() {
        assertThat(Participant("    pobi   ")).isEqualTo(Participant("pobi"))
    }

    @Test
    fun convertToString() {
        assertThat(Participant("pobi").toString()).isEqualTo("pobi")
    }
}
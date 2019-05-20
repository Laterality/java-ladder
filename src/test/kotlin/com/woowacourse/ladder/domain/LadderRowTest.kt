package com.woowacourse.ladder.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.util.*

class LadderRowTest {
    @Test
    fun create() {
        val booleans = Arrays.asList(true, false)
        assertThat(LadderRow(2, TestBooleanGenerator(booleans)))
            .isEqualTo(LadderRow(2, TestBooleanGenerator(booleans)))
    }

    @Test
    fun generateState() {
        val booleans = Arrays.asList(true, false)
        val generator = TestBooleanGenerator(booleans)
        val booleansActual = ArrayList<Boolean>()

        LadderRow(2, generator).forEachState { s -> booleansActual.add(s == LadderStepState.STEP) }
        assertThat(booleansActual).containsAll(booleans)
    }
}
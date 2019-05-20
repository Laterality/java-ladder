package com.woowacourse.ladder.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.util.*

class LadderStateTest {
    @Test
    fun create() {
        val generator = TestBooleanGenerator(Arrays.asList(true, false, false, true, false, false))
        val state = LadderState(3, 3, generator)
        val booleansActual = ArrayList<Boolean>()
        state.forEachRow { row ->
            row.forEachState { state ->
                booleansActual.add(LadderStepState.STEP.equals(true))
            }
        }
    }

    @Test
    fun createRandomly() {
        for (i in 0 until 100) {
            val state = LadderState(4, 5, RandomBooleanGenerator())
            state.forEachRow { row ->
                var previous = LadderStepState.EMPTY
                row.forEachState { state ->
                    if (previous == LadderStepState.STEP) {
                        assertThat(state).isNotEqualTo(LadderStepState.STEP)
                    }
                    previous = state
                }
            }
        }
    }
}
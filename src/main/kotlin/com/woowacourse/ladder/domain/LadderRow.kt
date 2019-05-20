package com.woowacourse.ladder.domain

class LadderRow(
    private val width: Int,
    generator: BooleanGenerator) {
    private val states = ArrayList<LadderStepState>()

    init {
        var previous = LadderStepState.EMPTY
        for (i in 0 until width) {
            val nextState = LadderStepState.valueOf(generator.generateBoolean())
            states.add(getNextStepState(previous, nextState))
            previous = nextState
        }
    }

    private fun getNextStepState(previous: LadderStepState, nextState: LadderStepState): LadderStepState {
        return if (previous == LadderStepState.STEP && nextState == LadderStepState.STEP) {
            LadderStepState.EMPTY
        } else {
            nextState
        }
    }

    fun forEachState(consumer: (s: LadderStepState) -> Unit) {
        states.forEach(consumer)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as LadderRow

        if (width != other.width) return false
        if (states != other.states) return false

        return true
    }

    override fun hashCode(): Int {
        var result = width
        result = 31 * result + states.hashCode()
        return result
    }


}

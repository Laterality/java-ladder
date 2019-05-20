package com.woowacourse.ladder.domain

enum class LadderStepState(private val hasStep: Boolean) {
    STEP(true), EMPTY(false);

    fun equals(hasStep: Boolean): Boolean {
        return this.hasStep == hasStep
    }

    companion object {
        fun valueOf(hasStep: Boolean): LadderStepState {
            return if (hasStep) {
                STEP
            } else {
                EMPTY
            }
        }
    }
}
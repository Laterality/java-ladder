package com.woowacourse.ladder.domain

import java.util.*
import kotlin.collections.ArrayList

class Ladder {
    companion object {
        fun match(state: LadderState, participants: List<String>, destinations: List<String>): LadderResultPair {
            val participantsToSwapped = ArrayList<String>(participants)
            state.forEachRow { row ->
                var i = 0
                row.forEachState { s ->
                    if (s == LadderStepState.STEP) {
                        Collections.swap(participantsToSwapped, i, i + 1)
                    }
                    i++
                }
            }

            val result = LadderResultPair()
            for (i in 0 until participantsToSwapped.size) {
                result.addPair(participantsToSwapped[i], destinations[i])
            }

            return result
        }
    }
}

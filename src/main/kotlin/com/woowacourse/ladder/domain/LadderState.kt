package com.woowacourse.ladder.domain

class LadderState(
    numOfParticipants: Int,
    height: Int,
    generator: BooleanGenerator) {
    private val rows = ArrayList<LadderRow>()

    init {
        for (i in 0 until height) {
            rows.add(LadderRow(numOfParticipants - 1, generator))
        }
    }

    fun forEachRow(consumer: (r:LadderRow) -> Unit){
        rows.forEach(consumer)
    }
}

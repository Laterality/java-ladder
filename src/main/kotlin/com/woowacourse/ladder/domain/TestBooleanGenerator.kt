package com.woowacourse.ladder.domain

class TestBooleanGenerator(
    private val booleans: List<Boolean>
) : BooleanGenerator {
    private var current = -1

    override fun generateBoolean(): Boolean {
        return booleans[++current]
    }
}

package com.woowacourse.ladder.domain

import java.util.*

class RandomBooleanGenerator : BooleanGenerator {
    override fun generateBoolean(): Boolean {
        return Random().nextBoolean()
    }
}

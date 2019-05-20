package com.woowacourse.stringadder

import java.lang.IllegalArgumentException

class PositiveInteger(number: Int) {
    private val number: Int = if (number < 0) {
        throw IllegalArgumentException()
    } else {
        number
    }

    fun addTo(i: PositiveInteger): PositiveInteger {
        return PositiveInteger(number + i.number)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PositiveInteger

        if (number != other.number) return false

        return true
    }

    override fun hashCode(): Int {
        return number
    }

    override fun toString(): String {
        return number.toString()
    }

}

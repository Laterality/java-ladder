package com.woowacourse.stringadder

class PositiveIntegerAdder {
    companion object {
        fun add(nums: List<PositiveInteger>): PositiveInteger {
            return nums.stream()
                .reduce(PositiveInteger(0)) { p1, p2 -> p1.addTo(p2) }
        }
    }
}

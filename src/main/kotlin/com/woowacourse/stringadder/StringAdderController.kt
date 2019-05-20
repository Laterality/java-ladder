package com.woowacourse.stringadder

class StringAdderController {
    companion object {
        fun sum(str: String): PositiveInteger{
            return PositiveIntegerAdder.add(StringParser.parse(str))
        }
    }
}

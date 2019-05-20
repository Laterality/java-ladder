package com.woowacourse.stringadder

import java.util.regex.Pattern
import java.util.stream.Collectors

class StringParser {
    companion object {
        private const val DELIMITERS_DEFAULT = ",:"

        fun parse(str: String): List<PositiveInteger> {
            if (str.startsWith("//")) {
                val splittedByNewline = str.split("\n")
                val customDelimiter = splittedByNewline[0].substring(2)
                val strToParse = splittedByNewline[1]
                return strToParse.split(createPattern(customDelimiter))
                    .stream()
                    .map { s -> s.trim() }
                    .map { s -> PositiveInteger(s.toInt()) }
                    .collect(Collectors.toList())
            }
            // String#split이 List<String>을 반환함
            return str.split(createPattern(null))
                .stream()
                .map { s -> s.trim() }
                .map { s -> PositiveInteger(s.toInt()) }
                .collect(Collectors.toList())
        }

        private fun createPattern(customDelimiter: String?): Pattern {
            if (customDelimiter == null) {
                return Pattern.compile(String.format("[%s]", DELIMITERS_DEFAULT))
            }
            return Pattern.compile(String.format("([%s]|%s)",
                DELIMITERS_DEFAULT, Pattern.quote(customDelimiter)))
        }
    }
}

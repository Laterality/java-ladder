package com.woowacourse.stringcalculator;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StringProcessorTest {

    @Test
    void testSplitDefaultDelimiter() {
        List<Integer> nums = StringProcessor.split("1,2,3");
        assertThat(nums).isEqualTo(Arrays.asList(1, 2, 3));
        nums = StringProcessor.split("1,2:3");
        assertThat(nums).isEqualTo(Arrays.asList(1, 2, 3));
    }
}

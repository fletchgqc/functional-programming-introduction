package com.gft.fpintroduction.list;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TailingArrayListTest {

    private static Integer sum = 0;

    @Test
    @Disabled
    void forEachTail() {
        TailingArrayList<Integer> tailingArrayList = new TailingArrayList<>();
        tailingArrayList.add(1);
        tailingArrayList.add(2);
        tailingArrayList.add(3);

        // uncomment this line
        //tailingArrayList.forTail(i -> sum += i);

        assertThat(sum).isEqualTo(3);
    }
}
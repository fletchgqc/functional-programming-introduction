package com.gft.fpintroduction.primer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Primer {

    List<Integer> getPrimes(List<Integer> list) {
        if (list.isEmpty()) {
            return list;
        } else {
            Integer head = list.get(0);

            List<Integer> tail = getPrimes(list.stream()
                    .filter((i) -> i % head != 0)
                    .collect(Collectors.toList()));

            List<Integer> resultList = new ArrayList<>();
            resultList.add(head);
            resultList.addAll(tail);
            return resultList;
        }
    }
}

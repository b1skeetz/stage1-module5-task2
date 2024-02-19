package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return x -> {
            List<Integer> result = new ArrayList<>();
            for (Integer integer : x) {
                result.add(integer / divider);
            }
            return result;
        };
    }
}

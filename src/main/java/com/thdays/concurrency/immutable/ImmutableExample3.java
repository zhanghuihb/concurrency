package com.thdays.concurrency.immutable;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

/**
 * @author Tainy
 * @date 2019-10-29 15:12
 */
public class ImmutableExample3 {

    private final static ImmutableList<Integer> LIST = ImmutableList.of(1,2,3);

    private final static ImmutableSet SET = ImmutableSet.copyOf(LIST);

    private final static ImmutableMap<Integer, Integer> MAP
            = ImmutableMap.<Integer, Integer>builder().put(1, 2).put(3,4).put(5, 6).build();

    public static void main(String[] args) {
//        LIST.add(1);
//        MAP.put(7, 8);
        System.out.println(MAP.get(3));
    }
}

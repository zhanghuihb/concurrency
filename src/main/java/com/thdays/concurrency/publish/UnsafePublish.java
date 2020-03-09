package com.thdays.concurrency.publish;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @author Tainy
 * @date 2019-10-29 9:09
 */
@Slf4j
public class UnsafePublish {

    private String[] states = {"a", "b", "c"};

    public String[] getStates(){
        return states;
    }

    public static void main(String[] args) {
        UnsafePublish publish = new UnsafePublish();
        log.info("{}", Arrays.toString(publish.getStates()));

        publish.getStates()[0] = "d";
        log.info("{}", Arrays.toString(publish.getStates()));
    }
}

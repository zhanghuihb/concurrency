package com.thdays.concurrency.publish;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Tainy
 * @date 2019-10-29 10:24
 */
@Slf4j
public class Escape {

    private int thisCsanBeEscape = 0;

    public Escape(){
        new InnerClass();
    }

    private class InnerClass{
        public InnerClass(){
            log.info("{}",Escape.this.thisCsanBeEscape);
        }
    }

    public static void main(String[] args) {
        new Escape();
    }
}

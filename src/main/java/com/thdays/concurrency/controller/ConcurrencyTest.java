package com.thdays.concurrency.controller;

import lombok.extern.slf4j.Slf4j;
import sun.rmi.runtime.Log;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @author Tainy
 * @date 2019-10-28 16:18
 */
@Slf4j
public class ConcurrencyTest {

    // 请求总数
    private static int clientTotal = 5000;

    // 并发数
    private static int threadCount = 300;

    // 计数器
    private static int count = 0;

    public static void add(){
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Semaphore semaphore  = new Semaphore(threadCount);
        final CountDownLatch countDownLatch = new CountDownLatch(clientTotal);
        for(int i = 0; i < clientTotal; i++){
            executorService.execute(() -> {
                try {
                    semaphore.acquire();
                    add();
                    semaphore.release();
                } catch (InterruptedException e) {
                    log.info(e.getMessage());
                }
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        executorService.shutdown();
        log.info("count:{}", count);
    }
}

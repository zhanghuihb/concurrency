package com.thdays.concurrency.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * 饿汉模式
 * 单例模式类装载时创建
 * 线程安全
 *
 * @author Tainy
 * @date 2019-10-29 10:35
 */
@Slf4j
public class SingletonExample2 {

    // 构造函数私有化
    private SingletonExample2(){

    }

    // 单例对象
    private static SingletonExample2 instance = new SingletonExample2();

    // 静态工厂方法
    public static SingletonExample2 getInstance(){
        return instance;
    }
}

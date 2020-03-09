package com.thdays.concurrency.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * 懒汉模式
 * 单例模式在第一次使用时创建
 * 线程不安全（双重加锁或者synchronized可以保证线程安全）
 *
 * @author Tainy
 * @date 2019-10-29 10:35
 */
@Slf4j
public class SingletonExample {

    // 构造函数私有化
    private SingletonExample (){

    }

    // 单例对象
    private static SingletonExample instance = null;

    // 静态工厂方法
    public static SingletonExample getInstance(){
        if(instance == null){
            instance = new SingletonExample();
        }

        return instance;
    }
}

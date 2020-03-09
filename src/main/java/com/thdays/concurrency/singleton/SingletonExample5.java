package com.thdays.concurrency.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * 懒汉模式->双重加锁模式
 * 单例模式在第一次使用时创建
 * 线程不安全（双重加锁或者synchronized可以保证线程安全）
 *
 * @author Tainy
 * @date 2019-10-29 10:35
 */
@Slf4j
public class SingletonExample5 {

    // 构造函数私有化
    private SingletonExample5(){

    }

    // 1. memory = allocate() 分配对象的内存空间
    // 3. ctorInstance() 初始化对象
    // 2. instance = memory 设置instance指向刚分配的内存

    // 单例对象
    private volatile static SingletonExample5 instance = null;

    // 静态工厂方法
    public static SingletonExample5 getInstance(){
        if(instance == null){
            synchronized (SingletonExample5.class){
                if(instance == null){
                    instance = new SingletonExample5();
                }
            }
        }

        return instance;
    }
}

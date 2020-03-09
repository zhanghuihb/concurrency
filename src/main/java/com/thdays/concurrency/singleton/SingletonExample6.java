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
public class SingletonExample6 {

    // 单例对象
    private static SingletonExample6 instance = null;

    // 构造函数私有化
    private SingletonExample6(){

    }

    static {
        instance = new SingletonExample6();
    }

    // 静态工厂方法
    public static SingletonExample6 getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(getInstance().hashCode());
        System.out.println(getInstance().hashCode());
    }
}

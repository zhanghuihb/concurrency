package com.thdays.concurrency.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * 枚举模式-线程安全
 *
 * @author Tainy
 * @date 2019-10-29 13:45
 */
@Slf4j
public class  SingletonEnum {
    // 构造器私有化
    private SingletonEnum(){

    }

    public static SingletonEnum getInstance(){
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton{
        INSTANCE;

        private SingletonEnum singletonEnum;

        // jvm 保证这个方法绝对只调用一次
        Singleton(){
            singletonEnum = new SingletonEnum();
        }

        public SingletonEnum getInstance(){
            return singletonEnum;
        }
    }
}

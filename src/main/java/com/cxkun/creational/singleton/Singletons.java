package com.cxkun.creational.singleton;

public class Singletons {
    /**
     * 懒汉式，线程不安全
     */
    public static class Singleton1 {
        private static Singleton1 instance;
        private Singleton1 (){}

        public static Singleton1 getInstance() {
            if (instance == null) {
                instance = new Singleton1();
            }
            return instance;
        }
    }

    /**
     * 懒汉式，效率低
     */
    public static class Singleton2 {
        private static Singleton2 instance;
        private Singleton2 (){}
        public static synchronized Singleton2 getInstance() {
            if (instance == null) {
                instance = new Singleton2();
            }
            return instance;
        }
    }

    /**
     * 饿汉式
     */
    public static class Singleton3 {
        private static Singleton3 instance = new Singleton3();
        private Singleton3(){}
        public static Singleton3 getInstance() {
            return instance;
        }
    }

    /**
     * double check
     */
    public static class Singleton4 {
        private volatile static Singleton4 instance;

        private Singleton4(){}

        public static Singleton4 getInstance() {
            if (instance == null) {
                synchronized (Singleton4.class) {
                    if (instance == null) {
                        instance = new Singleton4();
                    }
                }
            }
            return instance;
        }
    }
}

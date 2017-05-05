package com.tk.designpattern.single;

/**
 * <pre>
 *     author : TK
 *     time   : 2017/05/05
 *     desc   : 饿汉单例，线程安全
 * </pre>
 */
public final class SingleByHungry {
    private static final SingleByHungry instance = new SingleByHungry();

    private SingleByHungry() {

    }

    /**
     * 用空间来换取时间
     *
     * @return
     */
    public static SingleByHungry getInstance() {
        return instance;
    }

    public void doSomthing() {
    }
}

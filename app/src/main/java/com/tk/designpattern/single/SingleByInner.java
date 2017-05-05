package com.tk.designpattern.single;

/**
 * <pre>
 *     author : TK
 *     time   : 2017/05/05
 *     desc   : 静态内部类单例，线程安全
 * </pre>
 */
public class SingleByInner {
    private SingleByInner() {

    }

    /**
     * 当静态被第一次加载时才会初始化，由Java虚拟机维护，写法稍复杂，能满足需求
     *
     * @return
     */
    public static SingleByInner getInstance() {
        return Holder.instance;
    }

    private static class Holder {
        public static final SingleByInner instance = new SingleByInner();
    }

    public void doSomthing() {
    }
}

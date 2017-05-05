package com.tk.designpattern.single;

/**
 * <pre>
 *     author : TK
 *     time   : 2017/05/05
 *     desc   : 懒汉单例，线程安全
 * </pre>
 */
@Deprecated
public final class SingleByLazy {
    private static SingleByLazy instance;

    private SingleByLazy() {

    }

    /**
     * 每次都是同步，不必要的开销
     *
     * @return
     */
    public static synchronized SingleByLazy getInstance() {
        if (instance == null) {
            instance = new SingleByLazy();
        }
        return instance;
    }

    public void doSomthing() {
    }
}

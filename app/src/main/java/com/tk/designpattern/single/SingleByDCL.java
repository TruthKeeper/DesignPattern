package com.tk.designpattern.single;

/**
 * <pre>
 *     author : TK
 *     time   : 2017/05/05
 *     desc   : DCL单例，线程安全
 * </pre>
 */
public final class SingleByDCL {
    private static SingleByDCL instance;

    private SingleByDCL() {

    }

    /**
     * 只有在初始化时同步，能满足需求
     *
     * @return
     */
    public static synchronized SingleByDCL getInstance() {
        if (instance == null) {
            synchronized (SingleByDCL.class) {
                if (instance == null) {
                    instance = new SingleByDCL();
                }
            }
        }
        return instance;
    }

    public void doSomthing() {
    }
}

package com.tk.designpattern.single;

/**
 * <pre>
 *     author : TK
 *     time   : 2017/05/05
 *     desc   : 枚举单例，线程安全，由于在Android中枚举会有额外开销，不推荐
 * </pre>
 */
@Deprecated
public enum SingleByEnum {
    INSTANCE;

    public void doSomthing() {
    }
}

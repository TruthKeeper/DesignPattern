package com.tk.designpattern.single;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 *     author : TK
 *     time   : 2017/05/05
 *     desc   : 容器单例工具，相当于管理工具，隐藏了具体实现
 * </pre>
 */
public class SingleByMap {
    private static final Map<Class<?>, Object> map = new HashMap<>();

    private SingleByMap() {

    }

    /**
     * 在程序入口中初始化
     *
     * @param cls 书中是String，这里做了改动
     * @param obj
     */
    public static void register(Class<?> cls, Object obj) {
        map.put(cls, obj);
    }

    public static <T> T get(Class<T> cls) {
        return (T) map.get(cls);
    }
}

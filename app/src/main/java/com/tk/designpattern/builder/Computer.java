package com.tk.designpattern.builder;

/**
 * <pre>
 *     author : TK
 *     time   : 2017/05/05
 *     desc   : Builder模式构建一台电脑
 * </pre>
 */
public class Computer {
    private String screen;
    private String host;
    private String os;

    public String getScreen() {
        return screen;
    }

    public String getHost() {
        return host;
    }

    public String getOs() {
        return os;
    }

    private Computer(Builder builder) {
        screen = builder.screen;
        host = builder.host;
        os = builder.os;
    }

    public static final class Builder {
        private String screen;
        private String host;
        private String os;

        public Builder() {
        }

        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder host(String host) {
            this.host = host;
            return this;
        }

        public Builder os(String os) {
            this.os = os;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

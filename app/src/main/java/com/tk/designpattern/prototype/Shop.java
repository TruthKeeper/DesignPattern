package com.tk.designpattern.prototype;

/**
 * <pre>
 *     author : TK
 *     time   : 2017/05/05
 *     desc   : 原型模式，开分店的比喻
 * </pre>
 */
public class Shop implements Cloneable {
    private String name;
    private String location;
    private int type;
    //店长
    private Person manager;

    public Shop() {

    }

    public Shop(Shop shop) {
        this.name = shop.name;
        this.location = shop.location;
        this.type = shop.type;
        this.manager = shop.manager.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Person getManager() {
        return manager;
    }

    public void setManager(Person manager) {
        this.manager = manager;
    }

    @Override
    public Shop clone() {
        //成员变量非常多时用super.clone，不然就直接返回new的对象
//        try {
//            Shop shop = (Shop) super.clone();
//            shop.setManager(manager.clone());
//            return shop;
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return null;
        return new Shop(this);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", type=" + type +
                ", manager=" + manager +
                '}';
    }

    public static class Person implements Cloneable {
        private String name;
        private boolean man;
        private int id;

        public Person() {

        }

        public Person(Person person) {
            this.name = person.name;
            this.man = person.man;
            this.id = person.id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isMan() {
            return man;
        }

        public void setMan(boolean man) {
            this.man = man;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public Person clone() {
            //成员变量非常多时用super.clone，不然就直接返回new的对象
//            try {
//                return (Person) super.clone();
//            } catch (CloneNotSupportedException e) {
//                e.printStackTrace();
//            }
//            return null;
            return new Person(this);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", man=" + man +
                    ", id=" + id +
                    '}';
        }
    }
}

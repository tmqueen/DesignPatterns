public class Person {
    public static final Person person = new Person();
    public String name;

    //构造函数私有化
    private Person(){};

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    //提供全局静态方法
    public static Person getPerson(){
        return person;
    }

}

//饿汉式：线程安全

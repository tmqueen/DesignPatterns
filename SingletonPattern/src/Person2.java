public class Person2 {
    public static Person2 person;
    public String name;

    //构造函数私有化
    private Person2(){};

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    //提供全局静态方法
    public static synchronized Person2 getPerson(){
        if(person == null){
            person =  new Person2();
        }
        return person;
    }

}

//懒汉式：多线程安全

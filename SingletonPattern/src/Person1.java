public class Person1 {
    public static Person1 person;
    public String name;

    //构造函数私有化
    private Person1(){};

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    //提供全局静态方法
    public static Person1 getPerson(){
        if(person == null){
            person =  new Person1();
            //以下写法错误，为什么呢？？？
            //return new Person1();
        }
        return person;
    }

}

//懒汉式：单线程安全、多线程不安全

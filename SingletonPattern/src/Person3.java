public class Person3 {
    public static Person3 person;
    public String name;

    //构造函数私有化
    private Person3(){};

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    //提供全局静态方法
    public static Person3 getPerson(){
        if(person == null){
            synchronized (Person3.class){
                if(person == null){
                    person =  new Person3();
                }
            }
        }
        return person;
    }
}

//双重检查，进阶版懒汉式

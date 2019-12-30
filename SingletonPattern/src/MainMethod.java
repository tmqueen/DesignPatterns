public class MainMethod {
    public static void main(String[] args) {
        Person person1 = Person.getPerson();
        Person person2 = Person.getPerson();
        person1.setName("tmq");
        person2.setName("tmt");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

        Person1 person3 = Person1.getPerson();
        Person1 person4 = Person1.getPerson();
        person3.setName("123");
        person4.setName("321");
        System.out.println(person3.getName());
        System.out.println(person4.getName());

        Person2 person7 = Person2.getPerson();
        Person2 person8 = Person2.getPerson();
        person7.setName("666");
        person8.setName("888");
        System.out.println(person7.getName());
        System.out.println(person8.getName());

        Person3 person5 = Person3.getPerson();
        Person3 person6 = Person3.getPerson();
        person5.setName("456");
        person6.setName("654");
        System.out.println(person5.getName());
        System.out.println(person6.getName());
    }

}

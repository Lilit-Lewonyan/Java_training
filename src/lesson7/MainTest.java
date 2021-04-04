package lesson7;

public class MainTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setAge(2);
        person1.setName("Lilit");
        person1.setLastname("Levonyan");
        System.out.println(Person.count);

        Person person2 = new Person();

        System.out.println(Person.count);




    }
}

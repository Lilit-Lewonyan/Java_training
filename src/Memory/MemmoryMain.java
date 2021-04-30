package Memory;

public class MemmoryMain {
//    public static void main(String[] args) {
//        Person person = new Person();
//        person.setName("Lilit");
//        person.setAge(23);
//
//        System.out.println(person.getName());
//
//        Person person1 = new Person();
//        person1.setName("Edgar");
//        person1.setAge(26);
//        person =person1;
//        System.out.println(person1.getName());
//    }


    public static void main(String[] args) {
        Person p1 = new Person(15);
        Person p2 = new Person(25);
        swap(p1,p2);
        System.out.println(p1.getAge());
        System.out.println(p2.getAge());
        change(p1);
        System.out.println(p1.getAge());
        System.out.println(p2.getAge());
    }

    public  static  void  swap(Person a, Person b){
        Person temp = a;
        a=b;
        b= temp;

    }

    public  static  void  change(Person a){
        a.setAge(100);
        a = new Person(20);
        a.setAge(500);
    }
}

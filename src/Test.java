public class Test {
    public static void main(String[] args) {
        Person person = new Person();

        person.age =12;
        person.ismale = true;
        person.name = "Gago";

//        System.out.println(person.age );
//        System.out.println(person.ismale );
//        System.out.println(person.name );
        Person person1 = new Person();
        person1.age =14;
        person1.ismale = false;
        person1.name = "Vika";

        Person[] blabla = new Person[2];
        blabla[0]= person;
        blabla[1]= person1;
        for(int i=0; i<2; i++){
            System.out.print(blabla[i].ismale+" ");
            System.out.print(blabla[i].age+" ");
            System.out.print(blabla[i].name+" ");
        }

    }
}

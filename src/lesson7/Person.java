package lesson7;

public class Person {
    public static int count;
    private  String name;
    private String lastname;
    private int age;

    static {
        System.out.println("blablabla");
    }

     Person() {
         count++;
     }


    public String getName(){
        return name;
    }
    public String getLastname(){
        return lastname;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLastname(String  lastname){
        this.lastname = lastname;
    }
    public void setAge(int age){
        this.age = age;
    }
}

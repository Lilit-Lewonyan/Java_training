public class Person {
    private  static int number;
    private String firstname;
    private String  lastname;
    private int age;

    public int getAge() {
        return age;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }

    public static int getNumber(){
        return number;
    }

    public static void setNumber(int number){
        Person.number = number;
    }

    public  void setFirstname(String firstname){
        this.firstname =firstname;
    }

    public  void setLastname(String lastname){
        this.lastname =lastname;
    }

    public  void  setAge(int age){
        this.age = age;
    }
}

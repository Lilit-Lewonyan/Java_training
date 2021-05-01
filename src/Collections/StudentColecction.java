package Collections;

import Memory.Student;

public class StudentColecction implements Comparable{
    private String  name;
    private int age;
    StudentColecction(int age, String name){
        this.age =age;
        this.name =name;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return  this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        return this.name.compareTo(((StudentColecction) o).getName()) ;

        //this.age -((StudentColecction) o).getAge();
    }

    @Override
    public String toString() {
        return "StudentColecction{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

package Memory;

import java.util.Objects;

public class Person {
    private String  name;
    private int age;

    Person(int age){
        this.setAge(age);
    }

    public String  getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String  name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public  boolean equals(Object obj){
        if(this.age == ((Person)obj).age &&  this.name.equals(((Person)obj).name))
            return true;
        else
            return  false;
    }

//    @Override
//    public int hashCode() {
////        if (a == null)
////            return 0;
////
////        int result = 1;
////
////        for (Object element : a)
////            result = 31 * result + (element == null ? 0 : element.hashCode());
////
////        return result;
//    }
}

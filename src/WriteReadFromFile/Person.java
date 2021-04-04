package WriteReadFromFile;

public class Person {
    private String name;
    private String lastname;
    private int yearOfBirth;

    /*
    Getter methods
     */
    public String getName(){
        return name;
    }
    public String getLastname(){
        return lastname;
    }
    public int getYearOfBirth(){
        return yearOfBirth;
    }

    /*
    Setter methods
     */

    public void setName(String name){
        this.name = name;
    }

    public void setLastname(String lastname){
        this.lastname =lastname;
    }

    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth =yearOfBirth;
    }
}

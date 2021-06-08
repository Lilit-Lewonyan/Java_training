package Hima;

public class hencHima implements Comparable {
    private int age;
    private String name;

    public hencHima(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {

        return this.name.compareTo(((hencHima)o).getName());
    }
}

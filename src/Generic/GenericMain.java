package Generic;

public class GenericMain {
    public static void main(String[] args) {
        C var = new C();
        f(var);
    }

    public static <T extends A> void f(T anyName){
        anyName.print();

    }

}

abstract class A{
    public abstract void print();
}
class B extends A{

    @Override
    public void print() {
        System.out.println("I am B");
    }
}

class C extends  A{

    @Override
    public void print() {
        System.out.println("I am C");
    }
}

class D{

}

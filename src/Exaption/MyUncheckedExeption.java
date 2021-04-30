package Exaption;

public class MyUncheckedExeption extends RuntimeException {
    private String errorMess;

    MyUncheckedExeption(String errorMess){
        this.errorMess = errorMess;
    }

    public String toString(){
        return errorMess;
    }

}

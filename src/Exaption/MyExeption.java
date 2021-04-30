package Exaption;

public class MyExeption extends  Exception{
    private  String errorMassge;
    MyExeption(String errorMassge){
        this.errorMassge =errorMassge;
    }

    public String toString(){
        return errorMassge;
    }
}

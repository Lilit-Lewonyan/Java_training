package Exaption;

public class MySecondExeption extends MyExeption{
    private String errMessge;

    MySecondExeption(String errorMassge) {
        super(errorMassge);
        this.errMessge = errorMassge;
    }
}

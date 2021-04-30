package Exaption;

public class Main {
    public static void main(String[] args) {
//        int a=0;
//        int b =12;
//        try {
//
//            System.out.println(b/a);
//        }catch (ArithmeticException e)
//        {
//            e.printStackTrace();
//            System.out.println("incorrect ");
//        }
//
//        System.out.println("karen");


//        int[] ee = {12,111,990};
//        try {
//            System.out.println(ee[4]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("incorrect index");
//
//        }




        //Checked Exeption

//try {
//    System.out.println(divide(12, 99));
//    System.out.println(divide2(12, 2));
//}catch ( MySecondExeption e) {
//    System.out.println(e.toString());
//}catch (MyExeption e){
//    System.out.println(e.toString());
//}
        System.out.println(isAdult(15));

    }


//    public  static  int divide(int a, int b) throws MySecondExeption{
//        if(b==1)
//            throw new MySecondExeption("impossible MySecondExeption");
//        return a/b;
//    }
public  static  String  isAdult(int a) {
        assert a<18;
       // if(a<18)
          //  throw new MyUncheckedExeption("impossible bsdhbdhcvgdvc ");
        return "Blabla";
    }
//
//    public  static  int divide2(int a, int b) throws MyExeption{
//        if(b==2)
//            throw new MySecondExeption("impossible MyExeption");
//        return a/b;
//    }
}

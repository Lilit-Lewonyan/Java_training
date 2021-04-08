import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Calculator {
    /*
    Create a calculator which will get numbers from console and do + - / * functionality
     */

    private static double b;
    private static double result;
    private static  String  operator =" ";

    public static void main(String[] args) {
        System.out.println("You can input any number and use this ( + - / * ) operators. But please after each input press enter.");
        System.out.println("Start enter:");
        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextLine() ) {
//            if (operator.indexOf("=")!=-1)
//                break;
//            validationOfInput(scanner.nextLine());
//           // System.out.println(result);
//        }

        //while (operator.indexOf("=")==-1){
            validationOfInput(scanner.nextLine());
        //}
       /// System.out.println("a=" + a);
       // System.out.println("b=" + b);

        System.out.println("enter nuber:");


    }

    public static void  validationOfInput(String  input){
        String newString  = input.replaceAll(" ","");
        if(newString.indexOf("+")!=-1 && b>0){
            result=result+b;
            b=0;
            //System.out.println(result);
        }
        if(newString.indexOf("-")!=-1 && b>0){
            result=result-b;
            b=0;
           // System.out.println(result);
        }
        if(newString.indexOf("*")!=-1 && b>0){
            result=result*b;
            b=0;
          //  System.out.println(result);
        }
        if(newString.indexOf("/")!=-1 && b>0){
            result=result/b;
            b=0;
           // System.out.println(result);
        }
        if(newString.indexOf("=")!=-1 && b>0){
            b=0;
            operator = newString;
            System.out.println(result);
        }

        else if(newString.matches("[0-9]+")) {
            b = Double.parseDouble(newString);

        }



    }
}

package Exaption;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileReaderLilit {


    public static void main(String[] args)  {
        //File file = new File("/Users/levnyanlilit/Desktop/NPUA");
//
//        try {
//            Scanner scanner  = new Scanner(System.in);
//            System.out.println("Input first age");
//            int age1 = scanner.nextInt();
//            System.out.println("Input second age");
//            int age2 = scanner.nextInt();
//            System.out.println(age1/age2);
//        }catch (InputMismatchException e){
//            System.out.println("Invalid input");
//
//        }catch (ArithmeticException e){
//            System.out.println("CAn not divided 0");
//        }


//        try {
//            FileReader ileReader = new FileReader(file);
//        }catch (FileNotFoundException e){
//            System.out.println("File not found");
//
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input first age");
//        int age1 = scanner.nextInt();
//        System.out.println("Input second age");
//        int age2 = scanner.nextInt();
//        try {
//            System.out.println(divide1(age1, age2));
//        }catch (IOException e){
//            System.out.println("blabla");
//        }
//        System.out.println(divide2(age1, age2));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first age");
        int age1 = scanner.nextInt();
        System.out.println("Input second age");
        int age2 = scanner.nextInt();

    }

    public static  int divide1(int a, int b) throws IOException{
        if(b ==1){
            throw new  ArithmeticException("bl bla bla");
        }
        return a/b;
    }

//    public static  int divide2(int a, int b) throws ArithmeticException{
//        return a/b;
//    }
}

import java.util.Scanner;

public class lesson3Homework3 {
    public static void main(String[] args) {
        //Homework 3
        //task 7

        System.out.print("Enter the N ");
        Scanner n = new Scanner(System.in);
        int N = n.nextInt();
        if (N>0 && N<21)
        for(int i=0; i< 10; i++){
            System.out.println(N +"x" + (i+1)+ " = "+ N*(i+1));
        }

        else
            System.out.println("You inputted number is out of (0;21) range");

    }
}

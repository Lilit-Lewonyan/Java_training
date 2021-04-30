public class Lesson3 {
    public static void main(String[] args) {
        //Homework 1
        //Task 1 : Create an array and fill it with 2 number.
        int[] arrtask1 = {15, 16};
        System.out.println("Output of Task 1: ");
        for (int i = 0; i < 2; i++) {
            System.out.println("element " + i + "= " + arrtask1[i]);
        }

        //Task 2: Create an array and fill it with numbers from 1:1000.
        int[] arrtask2 = new int[1000];
        int j = 0;
        System.out.println("Output of Task 2: ");
        while (j < 1000) {
            arrtask2[j] = j + 1;
            if ((1000 - arrtask2[j]) % 100 == 0 && arrtask2[j]!=1)
                System.out.println(" " + arrtask2[j] + " ");
            else
                System.out.print(" " + arrtask2[j] + " ");
            j++;
        }


        //Task 3: Create an array and fill it with odd numbers from -20:20
        int[] arrtask3 = new int[41];
        int k = -20;
        System.out.println("Output of Task 3: ");
        for (int e=0;e < 41; e++) {
            arrtask3[e] =k;
            if ((40 - e) % 10 == 0 && e!= 0)
                System.out.println(" " + arrtask3[e] + " ");
            else
                System.out.print(" " + arrtask3[e] + " ");
            k++;
        }


        }

    }

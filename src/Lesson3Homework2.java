public class Lesson3Homework2 {
    public static void main(String[] args) {
        //Homework 2
        // Task 4: Create an array and fill it. Print all elements which can be divided by 5.
        System.out.println("Output of  Task 4");
        int[] arrtask4 = {66,55,78,44,15,11,12,19,25,22,30,35,47,45};
        for (int i =0; i<14; i++ ){
            if (arrtask4[i]%5==0)
                System.out.println("element "+"["+i+"] "+ arrtask4[i]);
        }

        System.out.println(" ");
        System.out.println("----------------");
        System.out.println("Output of  Task 5");
        //Task 5: Create an array and fill it. Print all elements which are between 24.12 and 467.23.
        float[] arrtask5 = {66.9f,55.1f,728f,44.8f,15.99f,119f,12f,19f,275.6f,22f,30.8f,38f,47.1f,45f,78f,44f,15.9f,11.8f,12.33f,188f};
        int j=0;
        while (j<20){
            if(arrtask5[j]>=24.12f && arrtask5[j]<=467.23f)
            System.out.println("element "+"["+j+"] "+arrtask5[j] );
            j++;
        }


        System.out.println(" ");
        System.out.println("----------------");
        System.out.println("Output of  Task 6");
        //Task 6:Create an array and fill it. Print count of elements which can be divided by 2.
        int[] arrtask6 = {66,55,728,448,1599,11,12,19,2756,22,30,38,471,45,798,44,159,118,123,18};
        int k=0;
        int count =0;
        while (k<20){
            if(arrtask6[k]%2==0)
                count++;
            k++;
        }
        System.out.println("count of elements which can be divided by 2 = "+ count );

    }
}

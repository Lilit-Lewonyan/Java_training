package ClonePackage;

public class CloneMain {
    public static void main(String[] args) {
        printZuygElement(9,6,6,6,9,12);
//        int [] myArray = new int[20];
//        for(int i; i<myArray.length;i++){
//
//        }
    }

    public static void printZuygElement(int... array){
        for (int i=0;i<array.length;i++)
            if(array[i]%2==0)
                System.out.println(array[i]);

    }
}

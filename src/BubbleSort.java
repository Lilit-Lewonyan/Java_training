public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[15];
        for (int i=0; i<arr.length; i++){
            arr[i] = arr.length -i;
            System.out.print(" "+arr[i] +" " );
        }

        System.out.println();
        //Bubble Sorting
        int max =0;
        for(int j=0; j<arr.length; j++){
            for(int k=0; k<arr.length-1-j;k++)
            if(arr[k]> arr[k+1]){
                max = arr[k];
                arr[k] = arr[k+1];
                arr[k+1] = max;
            }

        }

        for (int m=0; m<arr.length; m++){
            System.out.print(" "+arr[m] +" " );
        }


    }
}

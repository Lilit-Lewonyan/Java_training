public class SecondMax {

    public static void main(String[] args) {
        int[] a = {15,17,19,19,55,88,33,3,8,9};
        int max =0;
        int max2 = 0;
        for(int i=0; i<a.length;i++){
            max2 =i==0?a[i]:max2;
            max =i==0?a[i]:max;
            if(a[i]>max){
                max = a[i];

            }
            max2 = max<max2?max:max2;
        }
        System.out.println(max2);
        System.out.println(max);
    }
}

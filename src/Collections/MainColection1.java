package Collections;

import java.util.*;

public class MainColection1 {
    public static void main(String[] args) {
//        List<Integer> myArrayList = new ArrayList<>();
//        setRandomValus(myArrayList, 50);
//        System.out.println(myArrayList);
//        printnNotODD(myArrayList);
        Map<String,String> mard = new HashMap<>();
        mard.put("anun","Arman");
        mard.put("azganun","Ayvazyan");
        System.out.println(mard.get("anun"));


    }

    public static void setRandomValus(List<Integer> integersLis, int size ){

        Random rand = new Random();
        for (int i=0; i<50;i++){
             integersLis.add(rand.nextInt(1000));

        }


    }

    public  static  void  printnNotODD(List<Integer> integers){
        for (int i = 0; i< integers.size(); i++){
            if(integers.get(i)%2 ==0){
                System.out.println(integers.get(i));
            }
        }
    }
}

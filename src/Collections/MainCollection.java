package Collections;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class MainCollection {
    public static void main(String[] args) {
//        String[] poxos = new String[12];
//        List<String> list = new ArrayList<>();
//        list.add("bbb");
//        for (int i =0; i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//        List<String > lilit = Arrays.asList("gdcg","sxbjhs") ;

        StudentColecction s1 = new StudentColecction(11,"Lil");
        StudentColecction s3 = new StudentColecction(14,"hfh");
        StudentColecction s2 = new StudentColecction(18,"jdh");
        StudentColecction s5 = new StudentColecction(19,"dkjfj");
        StudentColecction s8 = new StudentColecction(13,"djfhdgus");
        List<StudentColecction> listS =  Arrays.asList(s1,s3,s2,s5,s8);
        System.out.println(listS);
        Collections.sort(listS);
        System.out.println(listS);
        Collections.reverse(listS);
        System.out.println(listS);
        Collections.sort(listS,new CompareBy());
        System.out.println(listS);
    }


}

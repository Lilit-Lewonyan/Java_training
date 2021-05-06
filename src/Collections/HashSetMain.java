package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetMain {
    public static void main(String[] args) {
        TreeSet<String> r1 = new TreeSet<>();
        r1.add("Armenia");
        r1.add("America");
        r1.add("Canada");
        r1.add("Armenia");
        r1.add("Italy");
        r1.add("USA");
       // r1.add(null);
        //r1.add(null);
      //  r1.add(null);
        //  Set<String> r2 = new HashSet<>();
        Iterator iterator = r1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (String element:r1) {
            System.out.println(element);
        }

    }

}

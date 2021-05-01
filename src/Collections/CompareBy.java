package Collections;

import java.util.Comparator;

public class CompareBy implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((StudentColecction)o1).getAge() - ((StudentColecction)o2).getAge();
    }
}

package Collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class CompareBy implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((StudentColecction)o1).getAge() - ((StudentColecction)o2).getAge();

    }
}

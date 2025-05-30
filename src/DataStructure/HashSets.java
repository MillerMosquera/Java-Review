package DataStructure;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSets {
    public static void main(String[] args) {

        //No permiten valores duplicados
        Set<Integer> sets = new HashSet<>();
        sets.add(1);
        sets.add(2);
        sets.add(3);
        sets.add(4);
        sets.add(3);

        System.out.println(sets);

        Iterator<Integer> iterator = sets.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(sets.remove(4));

        //HashSet
        HashSet<Integer> sets2 = new HashSet<>();
        sets2.add(1);
        sets2.add(2);
        sets2.add(3);

        System.out.println(sets2);
    }
}



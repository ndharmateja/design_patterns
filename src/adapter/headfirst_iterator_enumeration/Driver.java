package adapter.headfirst_iterator_enumeration;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    private static <T> void printEnumeration(Enumeration<T> enumeration) {
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(243);
        al.add(1324243);
        al.add(-3523);
        al.add(0);
        al.add(7);
        al.add(178);

        Enumeration<Integer> arrayListEnumeration = new IteratorAdapter<>(al.iterator());
        printEnumeration(arrayListEnumeration);
    }
}

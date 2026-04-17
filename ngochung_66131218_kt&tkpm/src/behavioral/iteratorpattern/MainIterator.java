package behavioral.iteratorpattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            var item = iterator.next();
            System.out.println(item);
        }
    }
}

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionEX {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) { // true 라면 looping
            String str = iterator.next();
            System.out.println(str);
        }

        for(String str:set) {
            System.out.println(str);
        }
    }
}

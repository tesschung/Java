import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ArrayListVSMap {

    public static void main(String[] args) {
        // String만 가지고 있는 ArrayList
        ArrayList<String> colors = new ArrayList<>();

        HashMap<String, Integer> people = new HashMap<>();

        // List 사용
        List<String> myList = new ArrayList<>();
        myList.add("red");
        myList.add("blue");
        myList.add("green");
        myList.add("yellow");
        System.out.println(myList);

        myList.add("black");
        System.out.println(myList);

        String third = myList.get(2);
        System.out.println(third);

        long count = myList.stream()
                .filter(w -> w.length() > 3)
                .count();
        System.out.println(count);

        long count2 = myList.parallelStream()
                .filter(w -> w.length() > 3)
                .count();
        System.out.println(count2);

//        long count3 = myList.stream()
//                .map(w -> w.trim())
//                .filter(w -> w.length() > 3)
//                .count();
//        System.out.println(count3);

//        myList.clear();
//        System.out.println(myList); // []

        // Immutable list (unmodiriable List)
        List<String> readOnlyList = Collections.unmodifiableList(myList);
        System.out.println(readOnlyList);

//        readOnlyList.add("white"); // error

        // Java9 of 메소드 사용
//        List<String> Java9List = List.of("red", "blue", "green");
        String str1 = "Hello! Java World";

        int index = str1.indexOf("Java");
        int size = "Java".length() ;

        String str2 = str1.substring(index, index+size);
        str2 = str2.toLowerCase();
        str2 = str2.replace('a', 'A');

        System.out.println(str2);

    }
}

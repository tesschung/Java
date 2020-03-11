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

//        myList.clear();
//        System.out.println(myList); // []

        // Immutable list (unmodiriable List)
        List<String> readOnlyList = Collections.unmodifiableList(myList);
        System.out.println(readOnlyList);

        readOnlyList.add("white"); // error

        // Java9 of 메소드 사용
        List<String> Java9List = List.of("red", "blue", "green");


    }
}

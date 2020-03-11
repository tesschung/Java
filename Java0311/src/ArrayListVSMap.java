import java.util.ArrayList;
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


        // Immutable list (unmodiriable List)


        // Java9 of 메소드 사용

    }
}

import java.util.ArrayList;

public class ArrayListPrac {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("김신의");
        nameList.add("김재");

        System.out.println(nameList.get(0));

        nameList.remove(0);
        nameList.clear();
        System.out.println(nameList.contains("김")); //값 확인

        System.out.println(nameList.size());
        System.out.println(nameList);

/**/
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);

        System.out.println(numList);

        for (int num:numList) {
            System.out.println(num * num);
        }
    }
}

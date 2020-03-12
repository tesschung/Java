import java.util.Arrays;
import java.util.Comparator;

public class Lamda {
    public static void main(String[] args) {
        String[] friends = {"park", "kim", "lee"};
        // (String first, String second) 라는 함수를 변수에 담아 넘겨준다.

        // 함수를 포함한 객체를 넣어야 한다.
        // 글자수에 따른 정렬
        // 타입이 같은경우
        // (String o1, String o2)
        // 생략가능
        Arrays.sort(friends, (o1, o2) -> o1.length() - o2.length());

        for (String item : friends ){
            System.out.println(item);
        }
    }
}

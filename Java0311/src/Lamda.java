public class Lamda {
    public static void main(String[] args) {
        String[] friends = {"kim", "lee", "park"};
        // (String first, String second) 라는 함수를 변수에 담아 넘겨준다.
        LengthComparator lengthComparator =
                (String first, String second) -> first.length() - second.length();

        Arrays.sort(friends, lengthComparator);
    }
}

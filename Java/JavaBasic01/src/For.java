public class For {
    public static void main(String[] args) {

        /*
        initialization; termination; increment
        for (초기화식; 종결제어식; 증감제어식) {
            반복 수행부분
        }
        1. 반복의 인덱스가 필요한 경우
        2. 반복의 최대 횟수가 정해진 경우
        3. 갯수가 정해진 데이터 셋(배열, 리스트 등)의 내용을 하나씩 봐야할 경우
         */

//        int i = 0;
//        for (; i <= 10; i++) {
//            System.out.println(i);
//        }
        int sum = 0;
        for (int i = 1; i <=5; i ++) {
            sum += i;
            System.out.println(sum); // 1 3 6 10 15
        }
        System.out.println(sum);

        for (int i = 1; i < 10; i ++) {
            for (int j = 1; j < 10; j ++) {
                System.out.println(i + " * "+ j + " = " + (i*j));
            }
        }
    }
}

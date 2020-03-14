public class While {
    public static void main(String[] args) {
        /*
        while (조건부분) {
            수행부분
        }
         */

        int i = 1;
        int sum = 0;
        while (i <= 3) { // i가 4가 됐을때 while문을 벗어난다.
            sum += i; // 1 3 6
            i++;
        }
        System.out.println(sum);

        int num = 10000, key = 153;
        int ans = 0;
//        while (ans <= num-key) {
//            ans += key;
//        }
//        System.out.println(ans);

        // 나머지가 0이 아닌 경우 계속 찾는다.
        // 0이 되면 나누어 떨어지는 경우 이므로 바로 찾을 수 있다.
        while (num%key > 0) {
            num--;
        }
        System.out.println(num);


    }
}

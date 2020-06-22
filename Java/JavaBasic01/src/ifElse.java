public class ifElse {
    public static void main(String[] args) {
        /*
        if (조건부분) {
            수행부분
        }
         */
        if (true) {
            System.out.println("true");
        }

        int temp = 21;

        if (temp < 10) {
            System.out.println("자켓을 입으세요.");
        } else if (temp >= 10 && 20 > temp){
            System.out.println("자켓을 입지마세요.");
        } else {
            System.out.println("반팔을 입으세요");
        }

        //
        int a = 38, b = 27;
        if (a == b) {
            System.out.println("a와 b가 같습니다. a = b = " + a);
        } else if (a != b) {
            System.out.println("a와 b는 같지 않습니다");
            // if 안에 if 추가
            if ( a > b) {
                System.out.print("a가 b보다 " + (a-b) + "만큼 더 큽니다.");
            } else {
                System.out.print("b가 a보다 " + (b-a) + "만큼 더 큽니다.");
            }
        }
        //

    }
}

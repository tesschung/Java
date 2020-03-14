import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
//        System.out.println("나이가 어떻게 되시나요?");

        //
//        Scanner scanner = new Scanner(System.in);
        // 입력한 정수를 받는다.
        // 정수를 받을땐 nextInt()
//        int age = scanner.nextInt();

//        System.out.println("나이는 "+age);


        // 문자열을 받을땐 next()
//        String name = scanner.next();
//        System.out.println(name);

        // 이처럼 입력받는 자료형에 따라 메소드가 달라진다.


        stop : while (true) {

            System.out.println("(I)ntro (C)ourses (E)xit");
            Scanner scanner = new Scanner(System.in);
            String key = scanner.next();


            switch (key) {
                case "i":
                case "I":
                    System.out.println("안녕하세요! 우리는 코드잇입니다.\n" +
                            "함께 공부합시다!\n" +
                            "(I)ntro (C)ourses (E)xit");
                    break;
                case "e":
                case "E":
                    System.out.println("안녕히 가세요.");

                    break stop;
                case "c":
                case "C":
                    System.out.println("코드잇 수업을 소개합니다.\n" +
                            "(P)ython (J)ava (i)OS (B)ack");
                    Scanner answer = new Scanner(System.in);
                    String nextKey = scanner.next();
                    switch (nextKey) {
                        case "p":
                        case "P":
                            System.out.println("Python 언어를 통해 컴퓨터 사이언스의 기초를 배웁니다.\n" +
                                    "강사: 강영훈\n" +
                                    "추천 선수과목: 없음");
                            break;
                        case "j":
                        case "J":
                            System.out.println("Java의 기본 문법과 객체지향적 프로그래밍을 배웁니다.\n" +
                                    "강사: 김신의\n" +
                                    "추천 선수과목: Python");
                            break;
                        case "i":
                        case "I":
                            System.out.println("최신 Swift 언어를 통해 iOS 개발을 시작할 수 있습니다.\n" +
                                    "강사: 성태호\n" +
                                    "추천 선수과목: Python, Java");
                            break;
                        case "b":
                        case "B":
                            break;
                    }
                    break;
            }


        }
    }
}

public class Variables {
    public static void main(String[] args) {
        // 자료형과 변수명
        // type variableName
        // 대소문자 구분
        // 숫자로 시작할 수 없음
        // 예약어 사용 불가
        // 밑줄('_') $ 외 특수문자 불가
        // 카멜케이스로 쓰는 것이 좋다.
        int age;
        age = 27;

        int num = 21;
        age = 26;

        // age = 22.6; 변수에 선언된 자료형이 아닌 값을 저장할 수 없다.

        age = num;
        age = age + 1;

        System.out.print("Hello, I'm ");
        System.out.print(age);
        System.out.print(".");

        boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        int myInt = 123;
        // int가 저장할 수 있는 값의 범위를 초과해서 에러가 난다.
        // -2^31 ~ 2^31-1 (-2147483648 ~ 2147483647) 까지 가능
        // myInt = 12345678910;
        // L을 추가해서 Long형 임을 표시해주어야 한다.

        // L 대문자를 사용하는 것이 권장
        long myLong = 12345678910L;

        double myDouble = 3.14;
        System.out.println(myDouble);

        String myString = "codeit!";
        System.out.println("hello!");
        String hello = "Hello I'm myString";
        System.out.println(hello);

        float f = 3.14f;

        char a1 = 'a';
        char a2 = 97; // 'a'에 해당하는 ASCII인 97
        System.out.print(a1);
        System.out.print(a2);
        System.out.println("");

        // 변수 정의 (자료형 잘 선정해서)
        // 코드를 입력하세요.
        String name;
        int year, month, day;
        Boolean married;

        // 값 대입
        // 코드를 입력하세요.
        name = "코드잇";
        year = 2015;
        month = 7;
        day = 20;
        married = false;

        // 자기 소개
        // 코드를 입력하세요.
        System.out.print("이름: ");
        System.out.println(name);
        System.out.print("생일: ");
        System.out.println(year+"년 "+month+"월 "+day+"일");
        System.out.print("결혼: "+married);
    }
}

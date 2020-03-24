## Java

# 02-3 main 메소드

다른 언어를 접해 본 독자라면 main 메소드(함수)의 의미에 대해서 알고 있을 것이다.

main 메소드는 프로그램의 시작을 의미한다. 만약 main 메소드가 없다면 프로그램을 단독으로 수행시킬 수 없다.

만약 다음과 같은 예제가 있다고 가정해 보자.

```
System.out.println("Hello World");
```

이 예제를 실행 해 보고 싶다면 여려분은 다음과 같이 main 메소드를 작성한 후 실행 해 보아야 한다. (※ 이 책의 모든 예제는 가능한한 main 메소드를 포함하고 있으나 그렇지 않은 경우도 있다.)

*Test.java*

```
public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

(※ 여기서 사용한 Test 클래스는 임의로 작성한 것이다. 꼭 이름이 Test일 필요는 없다.)

main 메소드를 보면 메소드명(main) 앞에 `public`, `static` 그리고 `void` 라는 키워드가 있다. `public`과 `static` 그리고 `void`에 대한 것은 뒤에서 자세하게 다룰 것이다.

메인 메소드는 프로그램 실행시 파라미터를 입력으로 받을 수 있다. 프로그램 실행시 전달되는 파라미터는 메소드의 입력 파라미터 `String[] args`에 저장된다.

위 Test 클래스를 작성 후 다음과 같이 호출할 수 있을 것이다.

```
c:\> java Test a b c
```

이와 같이 실행하면 `String[] args` 에는 입력으로 전달한 a b c 가 순서대로 저장되게 된다.

우리는 일단 main 메소드가 어떻게 동작하는지 보다는 프로그램을 실행하기 위해서는 반드시 main 메소드를 통해야 한다고만 알고 넘어가도록 하자.

> ※ main 메소드를 포함하고 있는 클래스를 이클립스에서 실행시키려면 이클립스 메뉴에서 Run -> Run As -> Java Application 을 실행하면 된다.
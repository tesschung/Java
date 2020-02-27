**"한 번만 작성하면, 어디서든 동작한다. (Write Once, Run Anywhere.)"**



'`자바 가상머신`'이라는 것만 설치되면, 어느 운영체제이든, 어느 디바이스이든, 동일하게 동작합니다. (자바 가상머신, Java Virtual Machine,  **JVM**)

**JRE** (Java Runtime Environment) JVM을 사용해서 마음껏 개발할 수 있는 환경

내 컴퓨터에 이런 환경을 만들기 위해서는 **JDK** (Java Development Kit) 라는 것을 설치

**객체 지향 프로그래밍 (Object Oriented Programming, OOP)**은 프로그램을 작성하는 기법

- 부품에 해당하는 객체 (Object)를 먼저 만들고, 이것들을 하나씩 조립 및 연결해서 전체 프로그램을 완성하는 기법



`Java project` 생성 -> `Class` 생성 순

Class의 변수명은 항상 대문자로 시작



Eclipse 삽질했다.

Package명을 꼭 작성하고 시작할 것.



- `ArithmeticException` 산술/연산예외

```java
		try {
			int z = 10%0;
			System.out.println(z);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없다.");
		}
```

그렇다고 해서 실수 타입인 0.0 또는 0.0f로 나누면 `ArithmeticException`이 발생하는 것이 아니라 `Infinity`(/ 경우)와 `NaN`(% 경우)이 산출되어 데이터가 엉망이 된다.

```java
		double x = 0.0;
		int a = 10;
		double z = a % x;
		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가.");
		} else {
			System.out.println(z);
		}
```



- Str1.`equals(str2)`

원본 문자열과 매개 값으로 주어진 비교 문자열이 동일한지 비교한 후 true 또는 false를 리턴한다. (즉, 객체가 참조하고 있는 주소값과는 상관없이 변수가 담고있는 값만을 비교한다.)



- `sout` == System.out.println()



- 표현할 수 있는 범위에 따라 정해짐
  - 뒤로갈 수록 표현할 수 있는 범위가 작다

`double` - `float` - `long` - `int` - `short` - `byte`





```java
int i = 10;
if (i % 3 == 0) { // i < 20 : 불린 식, 변수, 메소드
    System.out.println("C 구역입니다.");
} else if (1 % 3 == 1) {
    System.out.println("A 구역입니다.");
} else {
    System.out.println("B 구역입니다.");
}

switch (i % 3) { // i : 불린이 아닌 식, 변수, 메소드
    case 0:
        System.out.println("C 구역입니다.");
        break;
    case 1:
        System.out.println("A 구역입니다.");
        break;
    default:
        System.out.println("B 구역입니다.");
        break;
}
```



- `.toCharArray`()

```java
// 스트링을 배열로 만든다.
char[] charArray = dna.toCharArray();
```



- 객체지향프로그래밍 **OOP** Object Oriented Programming

정보와 동작들을 객체 단위로 묶고, 이런 객체들을 연결시키면서 정리하는 프로그래밍 방식

**'객체'**는 '속성'들과 '동작'들의 묶음이라고 할 수 있는데요. 속성은 **'변수'**로 나타내고, 동작은 **'메소드(함수)'**로 나타냅니다.



- 클래스란

  객체의 설계도

  - Property

  - Method
    - 클래스에 있는 함수

- 인스턴스

  - 클래스를 기반으로 만들어진 객체
  - Song - 걱정말아요 그대, 거위의 꿈
  - Person - 김신의, 문종모, 성태호

  

- 기본형 **Primitive Type** VS 참조형 **Reference Type**
  - 기본형 **Primitive Type**

    - Int, boolean, char, double
    - 변수가 그 값을 직접적으로 보관

  - 참조형 **Reference Type** // 배열을 포함한 객체

    - Person, String, int[]
    - 실제 값은 메모리에 저장, 변수는 그 영역을 가르킨다.

    - null은 참조형 변수만 가질 수 있는 값이다.

      - `null`을 보관하고 있는 변수의 메소드를 호출하려고 하면 `NullPointerException`이라는 오류가 난다.

      ```java
      Person[] people = new Person[5];
      people[0] = new Person("김신의", 28);
      people[2] = new Person("문종모", 26);
      people[3] = new Person("서혜린", 21);
      
      for (int i = 0; i < people.length; i++) {
          Person p = people[i];
          if (p != null) {
              System.out.println(p.getName());
          } else {
              System.out.println(i + "번 자리는 비었습니다.");
          }
      }
      ```

- 


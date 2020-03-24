## Java

### CharAt(인수) / indexOf(문자) / substring(인수1, 인수2)  / length()



#### CharAt(인수)

* 문자열에서 인자로 주어진 값에 해당하는 문자를 리턴

* 인수번째의 문자를 읽어냄.

* 예 )

  > "abcde".charAt(2)에는 'c'가 읽어짐.



* ##### 문법

```java
charAt(index)
```

* index - 필수, 0보다 큰 정수

* 문자열에 속하는 문자는 왼쪽부터 오른쪽까지 0부터 인덱싱되어 있음.
* charAt은 index로 주어진 값에 해당하는 문자를 리턴.
* 인덱스는 0부터 시작하기 때문에 index로 들어갈 수 있는 가장 큰 수는 (문자열.length - 1).
* 존재하지 않는 index를 인자로 전달하면 공백이 출력.
* charAt은 index에 해당하는 문자를 리턴하고, chartCodeAt은 유니코드 값을 리턴하는 차이가 있음.



#### indexOf(문자)

* 해당 문자가 들어있는 위치를 알려줌.

* 문자가 없으면 -1 반환

* 예 )

  > "abcde".indexOf("e")에는 4가 읽어짐.

* lastIndexOf는 뒤에서부터 셈.



#### substring(인수1, 인수2)

* charAt은 문자하나를 읽어내지만 substring은 문자열을 읽어냄.
* 인수1은 시작지점 문자(반환값에 포함).
* 인수2는 끝지점에 다음문자(반환값에 포함하지 않음).

* 예 )

  > "abcde".substring(1, 3)은 "bc"를 읽어냄.



#### length()

* 인수의 길이를 나타냄.
* 예 )

```java
String str = "abcd";
int i = str.length();
System.out.println(i)
    
-------------------------
4
```


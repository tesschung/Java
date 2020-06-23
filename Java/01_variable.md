## Java

## 02-1 변수

- [변수명](https://wikidocs.net/277#_1)
- [자료형 (Type)](https://wikidocs.net/277#type)
- [변수에 값 대입하기](https://wikidocs.net/277#_2)
- [자주 쓰이는 자료형](https://wikidocs.net/277#_3)
- [사용자 정의 자료형](https://wikidocs.net/277#_4)

다음 예와 같은 a, b를 변수(variable)라고 한다.

```
int a;
String b;
```

### 변수명

변수의 이름은 프로그래머가 마음대로 지을 수 있다. 위의 예처럼 a, b 라는 이름으로 지을 수도 아래와 같이 one, two 라는 이름으로도 지을 수 있다.

```
int one;
String two;
```

단, 변수의 이름을 지을 때는 다음과 같이 지켜야 할 몇가지 규칙이 있다.

- 변수명은 **숫자로 시작할 수 없다.**
- **_(underscore)** 와 **$** 문자 이외의 **특수문자는 사용할 수 없다.**
- 자바의 키워드(약속어)는 변수명으로 사용할 수 없다. (예: int, class, return 등)

*[참고] 자바 키워드*

```
abstract  continue  for         new        switch
assert    default   goto        package    synchronized
boolean   do        if          private    this
break     double    implements  protected  throw*
byte      else      import      public     throws*
case      enum      instanceof  return     transient
catch     extends   int         short      try
char      final     interface   static     void
class     finally   long        strictfp   volatile
const     float     native      super      while
```

잘못된 변수명의 사용예*

```
int 1st;   // 변수명은 숫자로 시작할 수 없다.
int a#;    // 변수명에 특수문자를 사용할 수 없다.
int class; // 키워드를 변수명으로 사용할 수 없다.
```

### 자료형 (Type)

변수명 앞의 int, String 등은 변수의 자료형(Type)을 뜻한다.

`int a;` 라는 문장은 다음과 같이 해석된다.

> 변수a 는 int 자료형 변수이다. 즉 a라는 변수에는 int 자료형 값(1, 10, 25 등의 정수값)만 담을 수 있다.

`String b;` 라는 문장은 다음과 같이 해석된다.

> 변수 b는 String 자료형 변수이다. 즉 b라는 변수에는 String 자료형 값("a", "hello" 등의 문자열값)만 담을 수 있다.

### 변수에 값 대입하기

변수 선언 후 다음과 같이 변수에 값을 대입 할 수 있다.

```
int a;
String b;

a = 1;
b = "hello java";
```

변수에 값을 대입할 때는 위의 예에서와 같이 `=`(assignment) 기호를 사용한다.

`a = 1;` 이라는 문장은 다음과 같이 해석된다.

> int 자료형 변수 a에 1 이라는 값을 대입한다.

`b = "hello java";` 라는 문장은 다음과 같이 해석된다.

> String 자료형 변수 b에 "hello java" 라는 값을 대입한다.

다음과 같이 변수를 선언함과 동시에 값을 대입할 수도 있다.

```
int a = 1;
String b = "hello java";
```



만약 int 자료형 변수인 a에 문자열을 대입하면 어떻게 될까?

```
int a = "Hello java";
```

이클립스에서는 다음과 같은 오류메시지를 보여준다.

```
Type mismatch: cannot convert from String to int
```

오류메시지는 String자료형을 int자료형으로 변환할 수 없다는 오류이다.



### 자주 쓰이는 자료형

자료형에는 int, String 외에도 많은 자료형이 있다. 자바에서 가장 많이 사용되는 자료형은 다음과 같다.

- int
- long
- double
- boolean
- char
- String
- StringBuffer
- List
- Map

예를 들어 StringBuffer, List 자료형에 해당되는 변수는 다음과 같이 만들 수 있다.

```
StringBuffer sb;
List myList;
```

위 코드는 다음과 같이 해석되어진다.

- sb 변수는 StringBuffer 자료형 변수이다. sb 변수에는 StringBuffer 자료형에 해당되는 값만 담을 수 있다.
- myList 변수는 List 자료형 변수이다. myList 변수에는 List 자료형에 해당되는 값만 담을 수 있다.

### 사용자 정의 자료형

또 나중에 공부하겠지만 사용자가 직접 자료형을 만들 수 있다.

예를 들어 다음과 같이 Animal 이라는 클래스를 만들면,

```
class Animal {
}
```

다음과 같이 Animal 자료형 변수를 만들 수 있다.

```
Animal cat;
```

위 코드는 다음과 같이 해석되어진다.

> cat 이라는 변수는 Animal 자료형 변수이다. cat이라는 변수에는 Animal 자료형에 해당되는 값만 담을 수 있다.
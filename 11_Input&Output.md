## Java



# Input&Output

> 문제풀다가 자바도 파이썬처럼 입출력을 빠르게 하는 클래스가 있는걸 알게되어서 정리!



## 출력문



## *println 

- **line feed**(\n, 개행문자) && **carriage return**를 가지고있다.

```java
System.out.println("abc");
System.out.println("123");
/*
abc
123
*/

System.out.print("abc");
System.out.println("123");
/*
abc123
*/

// 그래서 아래의 출력은 같다.
System.out.print("abc\n");
System.out.println("abc");
/*
abc
abc
*/
```



**''** 따움표: 문자(Character)

**""** 쌍따움표: 문자열(String)



## *printf (formating 하기)

*printf를 사용하면 입출력이 더 빠르다.



> 기본타입은? (논리값까지 포함하면 5가지이다.)

1. **문자**(**char**) 'ㅁ', '!'
2. **문자열**(**string**) "hello"
3. **정수**(byte short **int** long) 3, 12
4. **실수**(float, **double**) 0.1, 12.3
5. **논리값**(**boolean**) true false



자바의 기본형: char, string, int, double, boolean



%d

%f

%c

%s



```java
System.out.printf("%d %s", 10, "ABC");
/*
10  ABC
*/
```



## **\t** 과 중간 숫자 삽입

tab을 해준다. 일정한 간격으로 띄워져서 출력된다.

```java
System.out.printf("%d\t%s\n", 10 ,"Hello");
System.out.printf("%d\t%s\n", 10 ,"ABC");
System.out.printf("%d\t%s\n", 10 ,"NEW");

/*
10	Hello
10	ABC
10	NEW
*/
```

만약 tab(8자)를 넘어선다면?

```java
10	Hello
10	ABC
10	NEW
10029232	NEW
```

이런식으로 넘어가게되는 것을 볼 수 있다.



*그래서 해당 데이터가 들어갈 자리에 칸을 지정해주는 방식을 사용할 수 있다. 

> 숫자 오른쪽 정렬

```java
System.out.printf("%10d %s\n", 10 ,"Hello");
System.out.printf("%10d %s\n", 10 ,"ABC");
System.out.printf("%10d %s\n", 10 ,"NEW");
System.out.printf("%10d %s\n", 10029232 ,"NEW");

/*
        10 Hello
        10 ABC
        10 NEW
  10029232 NEW
*/
```



>  마이너스(-)숫자 왼쪽 정렬

```java
System.out.printf("%-10d %s\n", 10 ,"Hello");
System.out.printf("%-10d %s\n", 10 ,"ABC");
System.out.printf("%-10d %s\n", 10 ,"NEW");
System.out.printf("%-10d %s\n", 10029232 ,"NEW");

/*
10         Hello
10         ABC
10         NEW
10029232   NEW
*/
```



## %f 

*기본으로 소수점 `8자리`까지 찍는데,

- `%.3f`로 하면 `3자리`까지만 찍는다.

```java
System.out.printf("%-10.0f %s\n", 10.929232 ,"NEW");

/*
11         NEW
*/
```

*무조건 `절사`가 되게 하고싶으면,

- `-0.05`를 뺀다.

```java
System.out.printf("%-10.1f %s\n", 12.43 - 0.05 ,"NEW");
System.out.printf("%-10.1f %s\n", 12.46 - 0.05 ,"NEW");
/*
12.4       NEW
12.4       NEW
*/
```



## 입출력 주의사항

문자와 문자를 더하면 **숫자**가 나온다. 왜냐하면 컴퓨터는 문자를 숫자라고 인식하기 때문이다.

```java
System.out.println('A'+'B');

/*
131
*/

System.out.println(65 +'B');

/*
131
*/
```

---

유니코드 '\u0041'

```java
System.out.println('\u0041');
// A
```

아스키코드 65

문자 'A'





## BufferedReader

빠르게 입력 받을 수 있는 클래스

해당 클래스로 `readLine()` 메소드를 사용할 수 있는데, 이렇게 가져온 `String`을 `Integer.parseInt()`등 을 사용하여 용도에 맞춰 정제해 사용한다.



## BufferedWriter

빠르게 출력할 수 있는 클래스

해당 클래스로 `write()` 메소드를 사용할 수 있는데, 다 사용하고 나서 반드시 `close()`로 스트림을 닫아줘야 한다.



```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 처음에 br.readLine()으로 받을땐, String으로 들어와서 Integer.parseInt()로 타입변환을 해준다.
int T = Integer.parseInt(br.readLine());
//        List<Integer> ans = new ArrayList<>();
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//선언
    for (int i=0; i < T; i++) {
       str = br.readLine().split(" ");
      //            ans.add((Integer.parseInt(str[0])+Integer.parseInt(str[1])));
      bw.write((Integer.parseInt(str[0])+Integer.parseInt(str[1]))+"\n");//출력
        }
// bw.flush();//남아있는 데이터를 모두 출력시킴
bw.close();//스트림을 닫음
```



## StringTokenizer

1 2

3 4

위 처럼 입력되는 입력을 `" "`을 기준으로 Tokenizing해준다.

그리고, 앞에서 부터 `.nextToken()` 메소드로 변수에 할당 할 수 있다/순회할 수 있다.



## StringBuilder

String화 할 타입을 `.append()`해주면 String형식으로 차곡 차곡 쌓인다. Python에서 String에 `+`하는 식으로 쌓거나 `.join()`을 쓰던 방식과 약간 다르다. 이렇게 하면 시간이 많이 줄어든다.



```java
public class Main {
    // Stream으로 풀어보자
    static int N;
    static int X;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer1 = new StringTokenizer(br.readLine());
        N = Integer.parseInt(tokenizer1.nextToken());
        X = Integer.parseInt(tokenizer1.nextToken());

        String[] str = br.readLine().split(" ");

        int[] array = Arrays.stream(StringArrayToIntArray(str))
                .filter(x -> x < X )
                .toArray();

        StringBuilder sb = new StringBuilder();
        for(int num : array) { sb.append(num).append(" "); }
        System.out.println(sb);
    }
    static int[] StringArrayToIntArray(String[] stringArray)
    {
        return Stream.of(stringArray).mapToInt(Integer::parseInt).toArray();
    }
}

```




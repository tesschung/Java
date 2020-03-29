## Java



# Input&Output

> 문제풀다가 자바도 파이썬처럼 입출력을 빠르게 하는 클래스가 있는걸 알게되어서 정리!



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




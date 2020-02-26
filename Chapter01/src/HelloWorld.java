//
/*
* */

// public - 접근제어자 // private, protected
// HelloWorld - 라는 클래스
// main - method 이름
// args라는 문자열 배열을 파라미터로 받음
// void 필요에 따라 실행이 끝나고 어떤 값을 돌려주게되는데, 그 되돌려줄 값이 뭔지 미리 메소드 이름앞에 써주게된다.
// void는 되돌려줄 값이 없다는 의미
// 실행이 끝나고 숫자형을 되돌려줄 예정인 경우 void대신 숫자를 의미하는 int를 쓰자.
public class HelloWorld { // HelloWorld라는 이름의 공개된 클래스를 만든다.
  public static void main(String[] args) {
      // main methods
      // System이라는 클래스의 out이라는 변수의 println이라는 메소드 호출
      // System은 입력, 출력 등 시스템에 관련된 기능을 모아둔 클래스
      // println에서 ln은 Line의 줄임말. 괄호 안에 원하는 텍스트를 넣으면 출력해주고,
      // 마지막에는 엔터를 치듯이 다음 줄로 넘겨준다.
      System.out.println("Hello World");
      System.out.print("Hello World");
      //sout이라고 치면 쉽게 작성가능하다.
  }
}

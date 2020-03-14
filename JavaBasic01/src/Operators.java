public class Operators {
    public static void main(String[] args) {
        String myString = "my" + "String";
        System.out.println(myString);


        System.out.println("Boolean 연산자 - and &&");
        System.out.println("true && true : " + (true && true));
        System.out.println("true && false : " + (true && false));
        System.out.println("false && true : " + (false && true));
        System.out.println("false && false : " + (false && false));

        System.out.println("Boolean 연산자 - or ||");
        System.out.println("true || true : " + (true || true));
        System.out.println("true || false : " + (true || false));
        System.out.println("false || true : " + (false || true));
        System.out.println("false || false : " + (false || false));

        System.out.println("Boolean 연산자 - not 보수 !");
        System.out.println("!true : " + !true);
        System.out.println("!false : " + !false);

        System.out.println(!(false && (true||false)));

        System.out.println("데카르트는 \"나는 생각한다. 고로 존재한다.\"라고 말했다.");
    }
}

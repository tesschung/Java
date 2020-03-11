public class Methods {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        int result = a+b;
        System.out.println(result);

        int resultAdd = add(a,b);
        System.out.println(resultAdd);

    }
    public static int add(int first, int second) {
        return first+second;
    }

    public static void callByValue(int param) {}
}

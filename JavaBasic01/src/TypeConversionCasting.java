public class TypeConversionCasting {
    public static void main(String[] args) {
        double x = 3.14;
        // (int) type casting
        int y = (int) x;
        System.out.println(y);

        int a = 9;
        int b = 5;
        System.out.println((double) a / b);

        double koreanScore, mathScore, scienceScore, computerScore;
        koreanScore = 86;
        mathScore = 94;
        scienceScore = 87;
        computerScore = 100;

        // 모두 double 이여야 제대로된 소수형 결과가 나온다.
        System.out.print((koreanScore+mathScore+scienceScore+computerScore)/4);
    }
}

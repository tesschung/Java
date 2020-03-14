import java.util.Arrays;

public class multiArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array));
        int[][] multiArray = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        for (int i=0; i < multiArray.length; i++){
            System.out.println(Arrays.toString(multiArray[i]));
        }

        // '행(줄)'을 첫 번째 대괄호에, '열(칸)'을 두 번째 대괄호에 넣습니다.
        int[][] multiArray2 = new int[3][4];
        for (int i = 0; i < multiArray2[0].length; i++) {
            multiArray2[0][i] = 1 + i;
        }
        for (int i = 0; i < multiArray2.length; i++) {
            for (int j = 0; j < multiArray2[i].length; j++) {
                multiArray2[i][j] = (i * 4 + 1) + j;
            }
        }
    }
}

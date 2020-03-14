public class ShapePrinter {

    boolean printTriangle(int height) {
        // 파라미터로 정수형 height를 받고, 높이 height인 '직각 이등변 삼각형'을 출력
        /*
        3인 경우
        *
        * *
        * * *
         */
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) { // 한 번은 무조건 출력된다.
                System.out.print("* ");
            }
            System.out.println("");
        }
        return true;
    }

    boolean printPyramid(int height) {
        for (int i = 0; i < height; i++) {

            // 별이 찍히는 위치, 앞에 공백 존재
            for (int j = 0; j < height - 1 - i; j++) {
                System.out.print(" ");
            }

            // 홀수증가
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


        return true;
    }

    boolean printFloydsPyramid(int height) {
        /*
        입력
        3
        출
        1
        2 3
        4 5 6
        ----------

         */
//        int length = height * (height + 1) / 2; // String.valueOf(height*(height+1)/2).length();
////        System.out.println(length);
//        // 채워넣고,
//        int[] intArray = new int[length];
//        for (int i = 1; i <= length; i++) {
//            intArray[i - 1] = i;
//        }
//
//        int row = 0;
//        int num = 1;
//        stop : for (int i = 1; i < length; i++) {
//            if (row == 0) {
//                System.out.print(intArray[0] + " ");
//            } else {
//                for (int j = row - 1; j < row + num; j++) {
//                    if (j < length) {
//                        if (intArray[j] < 10) {
//                            System.out.print(intArray[j] + "  ");
//                        } else {
//                            System.out.print(intArray[j] + " ");
//                        }
//
//                        if (intArray[j] == length) {
//                            break stop;
//                        }
//                    }
//                }
//                num++;
//            }
//            row += 2;
//            System.out.println("");
//        }
//        System.out.println("");
//
//
//        return true;


        // 숫자 자리 구하기
        // 마지막 끝 값의 자리수 파악
        // 공백을 위해서 미리 파악해둔다!
        int length = String.valueOf(height * (height + 1) / 2).length();

        // 인쇄될 수
        int number = 1;

        // 행을 바꾸는 반복문
        for (int row = 1; row <= height; row++) {
            // 한 행에서 인쇄될 내용을 담는 문자열 선언
            String line = "";


            // 한 행에서 열을 바꾸는 반복문
            // 원소 개수는 해당 층이랑 같다
            for (int col = 1; col <= row; col++) {

                // 한 열 안에서 자리수를 맞추는 반복문 //
                for (int i = String.valueOf(number).length(); i < length; i++) {
                    line += " ";
                }

                // 실제 인쇄될 수를 문자열에 더하고, 한 칸 띄워주기
                line += (number + " ");

                number++;
            }
            // 출력
            System.out.println(line);
        }

        return true;
    }
}

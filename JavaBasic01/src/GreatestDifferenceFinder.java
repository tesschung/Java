public class GreatestDifferenceFinder {
    int greatestDifference(int[] intArray) {
        // 2보다 작으면 비교할 대상이 없으므로 0 리턴
        if (intArray.length <= 1) {
            return 0;
        }
//        // 배열 내의 두 원소 차이 중 가장 큰 차이를 리턴
//        int myMax = 0;
//        int current = 0;
//        for (int i = 0; i < intArray.length-1; i ++ ){
//            for (int j = i+1; j < intArray.length; j ++) {
//                current = Math.abs(intArray[i] - intArray[j]);
//                if (myMax < current) {
//                    myMax = current;
//                }
//            }
//        }
//        return myMax;

        // 최댓값, 최솟값 구하기
        int max = intArray[0];
        int min = intArray[0];

        for (int num : intArray) {
            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }
        // 최대 차 리턴
        return max - min;
    }
}

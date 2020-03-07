public class AverageFinder{
    double computeAverage(int[] intArray) {
//        int sum = 0;
//        for (int i=0; i < intArray.length; i++) {
//            sum += intArray[i];
//        }
        // for each
        int sum = 0;
        for (int num : intArray) {
            sum += num;
        }
        return (double) sum / intArray.length;
    }
}

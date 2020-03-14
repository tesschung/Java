import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // 배열로 값을 여러개 묶어서 저장

        String[] strings = new String[5];
        System.out.println(Arrays.toString(strings));

        int[] intArray = new int[5];
        System.out.println(Arrays.toString(intArray));
        intArray[0] = 2;
        intArray[1] = 3;
        intArray[2] = 5;
        intArray[3] = 7;
        intArray[4] = 11;
        System.out.println(intArray[0]);
        // intArray.length == 5
        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }

        int[] arr1 = {1, 2, 3, 4, 5};

        // 같은 주소 참
        int[] arr2 = arr1;

        // deepcopy 새롭게 복사
        int[] arr3 = arr1.clone();

        // for-each
        // 처음에 수행 부분으로 들어갈 때 i는 intArray의 0번 인덱스의 값(원소)을 갖게 되고,
        // 그 다음 들어갈 때는 1번 인덱스의 값(원소)을 갖게 되고...
        // 이런 식으로 배열의 마지막 값(원소)까지 갖게 됩니다.
        for (int i : intArray) {
            System.out.println(i);
        }

        for (double i : intArray) {
            System.out.println(i);
        }

        String[] fruitsArray = new String[5];

        fruitsArray[0] = "딸기";
        fruitsArray[1] = "당근";
        fruitsArray[2] = "수박";
        fruitsArray[3] = "참외";
        fruitsArray[4] = "메론";

        for (String fruit : fruitsArray) {
            System.out.println(fruit);
        }



        // String 배열에 아래와 같이 저장한 후,
        String[] remainders = {"Zero", "One", "Two", "Three"};
//        remainders[0] = "Zero";
//        remainders[1] = "One";
//        remainders[2] = "Two";
//        remainders[3] = "Three";

        int[] intArrayE = new int[30];
//        int j = 1001;
        for (int i = 0; i < intArrayE.length; i ++) {
            intArrayE[i] = 1001 + i;
            System.out.println(remainders[intArrayE[i]%4]);
//            switch (intArrayE[i] % 4) {
//                case 0 :
//                    System.out.println(remainders[0]);
//                    break;
//                case 1:
//                    System.out.println(remainders[1]);
//                    break;
//                case 2:
//                    System.out.println(remainders[2]);
//                    break;
//                case 3:
//                    System.out.println(remainders[3]);
//                    break;
//                default:
//                    break;
//            }
        }
        /*
        TAGG, CCAG, AGCC가 총 몇 번 등장하는지 세어봅시다.
        TAGG가 2번, CCAG가 4번, AGCC가 3번 등장한다면 아래와 같은 출력 값이 나옵니다.
        TAGG: 2
        CCAG: 4
        AGCC: 3
         */
        // 문자열의 toCharArray() 메소드(함수)를 사용하면 char[] 배열을 얻을 수 있습니다.
        char[] sequence = "abc".toCharArray();
        System.out.println(Arrays.toString(sequence));
        // 반대로 char[] 배열을 문자열로 바꾸려면 이렇게 하면 됩니다:
        String stringFromCharArr = new String(sequence);
        System.out.println(stringFromCharArr);

        String dna = "GATCCGCCCGCCTCGGCCTCCCAAAGTGCTGGGATTACAGGTGTGAGCCA"
                + "CCACGCCCGGCTAATTTTTATTTATTTATTTAAAGACAGAGTCTCACTCT"
                + "GTCACTCAGGCTAGAGTGCAGTGGCACCATCTCAGCTCACTGCAGCCTTG"
                + "ACCTCCCTGGGCTCCGGTGATTTCACCCTCCCAAGTAGCTAGGACTACAG"
                + "GCACATGCCACGACACCCAGCTAATTTTTTATTTTCTGTGAAGTCAAGGT"
                + "CTTGCTACGTTGCCCATGCTGGTATCAAACCCCTGGGCTCAATCAATCCT"
                + "TCCACCTCAGCCTCCCCAAGTATTGGGGTTACAGGCATGAGCTACCACAC"
                + "TCAGCCCTAGCCTACTTGAAACGTGTTCAGAGCATTTAAGTTACCCTACA"
                + "GTTGGGCAAAGTCATCTAACACAAAGCCCTTTTTATAGTAATAAAATGTT"
                + "GTATATCTCATGTGATTTATTGAATATTGTTACTGAAAGTGAGAAACAGC"
                + "ATGGTTGCATGAAAGGAGGCACAGTCGAGCCAGGCACAGCCTGGGCGCAG"
                + "AGCGAGACTCAAAAAAAGAAAAGGCCAGGCGCACTGGCTCACGCCTGTAA"
                + "TCCCAGCATTTCGGGAGGCTGAGGCGGGTGGATCACCTGAGGTCAGGAGT"
                + "TCAAGACCAGCCTAGCCAACATGGTGAAACCCCGTCTCTACTAAAATACA"
                + "AAAATTAACCGGGCGTGATGGCAGGTGCCTGTAATCCCAGCTACTTGGGA"
                + "GGCTGAGGCAGGAGAATCGCTTGAACCAGGAGGCGGAGGTTGCAGGGAGC"
                + "CAAGATGGCGCCACTGCACTCCAGCCTGGGCGATAGAGTGAGACTCCGTC"
                + "TCAGAAAAAAAAGAAAAGAAACGAGGCACAGTCGCATGCACATGTAGTCC"
                + "CAGTTACTTGAGAGGCTAAGGCAGGAGGATCTCTTGAGCCCAAGAGTTTG"
                + "AGTCCAGCCTGAACAACATAGCAAGACATCATCTCTAAAATTTAAAAAAG"
                + "GGCCGGGCACAGTGGCTCACACCTGTAATCCCAGCACTTTGGGAGGTGGA"
                + "GGTGGGTAGATCACCTGACGTCAGGAGTTGGAAACCAGCCTGGCTAACAT";
        // 스트링을 배열로 만든다.
        char[] charArray = dna.toCharArray();
        // 현재 상태를 담을 current를 만든다.
        char[] current = new char[4];

        // 값을 저장할 곳
        String[] elements = { "TAGG", "CCAG", "AGCC"};
        int[] result = new int[3];

        for (int i=0; i < charArray.length-3; i++) {
            // 갱신해준다.
            current[0] = charArray[i];
            current[1] = charArray[i+1];
            current[2] = charArray[i+2];
            current[3] = charArray[i+3];

            // current에 담긴 값을 스트링으로 만든다.
            String strFromCharArr = new String(current);
            for (int j = 0; j < elements.length; j ++) {
                if (elements[j].equals(strFromCharArr)) {
                    result[j] += 1;
                }
            }
        }
        for (int i = 0; i < elements.length; i ++ ) {
            System.out.println(elements[i]+ ": " + result[i]);
        }
    }
}

public class Switch {
    public static void main(String[] args) {
        /*
        if (condition) {
            do
        } else if (condition2) {
            do2
        } else {
            do3
        }

        switch (variable or operation) {
            case condition1:
                do1
                break
            case condition2:
                do2
                break
            default:
                defaultDo
        }
         */
    int score = 97;
    String grade;

    switch (score / 10) {
        case 10:
            grade = "A+";
            break;
        case 9:
            grade = "A";
            break;
        case 8:
            grade = "B";
            System.out.println("참 잘했어요!");
            break;
            case 7:
            grade = "C";
            break;
        case 6:
            grade = "D";
            break;
        default:
            grade = "F";
            break;
    }
        System.out.println(grade);

    int number = 134354;
//        System.out.println(number%7);
    switch (number%7) {
        case 1:
            System.out.print("One");
            break;
        case 2:
            System.out.print("Two");
            break;
        case 3:
            System.out.print("Three");
            break;
        case 4:
            System.out.print("Four");
            break;
        case 5:
            System.out.print("Five");
            break;
        case 6:
            System.out.print("Six");
            break;
        default: // 반드시 default값 설정
            break;
    }
    }
}


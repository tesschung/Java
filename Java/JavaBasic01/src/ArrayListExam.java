import java.util.ArrayList;

public class ArrayListExam {
    public static int getSurvivingIndex(int n, int k) {
        // 코드를 입력하세요.
        // 김신 장군 살리기
        System.out.println(" ");
        // 20명이 서있고,
        // 한명씩 나가서 k번째 사람이 죽는다.
        // 마지막으로 죽어야하는 사람의 자리를 리턴해준다.
        // 즉 마지막으로 죽지 않도록. 하는 것

        // 20명이 들어갈 ArrayList를 만든다.

        int killIndex = 0;

        ArrayList<Integer> willKilled = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            willKilled.add(i);
        }
//        System.out.println(willKilled);

        while (true) {
//            System.out.println(killIndex);
            killIndex = killIndex + (5-1);
//            System.out.println(killIndex);
//            System.out.println(willKilled.size());
//            System.out.println(willKilled);
            // 사이즈가 11일때, 11인덱스인 경우, 인덱스는 0~10까지이므로 같거나 클때로 조건을 달리해야 한다.

            if (killIndex >= willKilled.size()) {
            // 인덱스를 초과하는 경우 나머지로 초기화 해준다.
                killIndex = killIndex%willKilled.size();
//                System.out.println("--?");
            }

//            System.out.println(killIndex);
            willKilled.get(killIndex);
            System.out.println(willKilled.get(killIndex)+"번 군사가 죽습니다.");

            willKilled.remove(killIndex);


            if (willKilled.size() == 1) {return willKilled.get(0);}
        }


    }

    public static void main(String[] args) {
        System.out.println("김신은 " + getSurvivingIndex(20, 5) + "번 자리에 서있으면 됩니다.");
    }
}

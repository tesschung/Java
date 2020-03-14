public class BankDriver {
    public static void main(String[] args) {
        // 사람 생성
//        Person p1 = new Person();
////        p1.name = "김신의";
//p1.setName("김신의");
//        // 접근 제어자(Access Modifier)를 통해 값 구분
////        p1.age = 28;
////        p1.age = -10;
//        p1.setAge(28);
//        p1.setAge(-10);
////        p1.cashAmount = 100000;
//p1.setCashAmount(100000);
//
////        System.out.println(p1.getAge());
//
//        // 은행 계좌 생성
//        BankAccount a1 = new BankAccount();
//        a1.setBalance(500000);
//
//        // 관계 설정
////        p1.account = a1;
//
//        a1.setOwner(p1);
//
//        System.out.println(a1.deposit(30000));
//        System.out.println(
//        a1.withdraw(170000));
//        System.out.println(
//        a1.deposit(6200000));
//        System.out.println(
//        a1.withdraw(890000));
// 사람 1
//        Person p1 = new Person();
//        p1.setName("김신의");
//        p1.setAge(28);
//        p1.setCashAmount(30000);

        Person p1 = new Person("김신의", 25, 30000);
        // 은행 계좌 1
//        BankAccount a1 = new BankAccount();
        BankAccount a1 = new BankAccount(100000);
        a1.setBalance(100000);

        p1.setAccount(a1);
        a1.setOwner(p1);

        // 사람 2
//        Person p2 = new Person();
//        p2.setName("문종모");
//        p2.setAge(25);
//        p2.setCashAmount(100000);

        Person p2 = new Person("문종모", 25, 30000);
        // 은행 계좌 2
//        BankAccount a2 = new BankAccount();
        BankAccount a2 = new BankAccount(500000);
//        a2.setBalance(500000);

        p2.setAccount(a2);
        a2.setOwner(p2);

        // 계좌 이체 테스트
        a2.transfer(a1, 200000);
        a1.transfer(p2, 150000);
        p2.transfer(a1, 270000);
        p1.transfer(p2, 130000);


        // 생성자 생성 후
        // 아래와 같이 생성 가능해져서 더욱 간단해진다.
        Person p3 = new Person("김신의", 28, 30000);


    }
}

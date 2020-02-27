public class Person {
    // property
    private String name;
    // private 접근제어
    // private 라고 쓰면 class에서만 접근 가능하도록 하게됨
    private int age;
    private int cashAmount;

    private BankAccount account;

    // 생성자 생성
    // 생성자의 파라미터로 속성을 받아 각 인스턴스에 지정
    public Person(String name, int age, int cashAmount) {
        this.name = name;
        this.age = age;
        this.cashAmount = Math.max(cashAmount, 0);
    }

    // 생성자도 메소드 오버로딩이 가능하다
    public Person(String name, int age) {
        if (age < 0) {
            this.age = 12;
        } else {
            this.age = age;
        }
        this.name = name;
        this.cashAmount = 0;
    }

    public void setAge(int newAge) {
        if (newAge > 0) { // 새로운 값이 양수일때만 넣어준다.
            age = newAge;
        }
    }

    public int getAge() {
        return age;
    }

    /*
    public void setName(String newName) {
        // 파라미터 이름은 반드시 다르게 해야 한다.
        // 그렇게 하고 싶지않은 경우 this키워드를 사용하면된다.
        name = newName;
    }
    */

    public void setName(String name) {
        // 파라미터 이름은 반드시 다르게 해야 한다.
        // 그렇게 하고 싶지않은 경우 this키워드를 사용하면된다.
        // 아래와 같이.
        // this.name은 인스턴스 변수 name을 가르키게 된다.
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCashAmount(int cashAmount) {
        if (cashAmount >= 0) {
            this.cashAmount = cashAmount;
        }
    }

    public int getCashAmount() {
        return cashAmount;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    // account와 account 간의 거래이므로, 첫째로 BankAccount 클래스의 transfer 메소드를 써야함.
    // 둘째로 Person to의 정보를 to의 account 정보로 바꾸어 호출.
    public boolean transfer(Person to, int amount) {
        return account.transfer(to.getAccount(), amount);
    }

//    public boolean transfer(Person to, int amount) {
//        return account.transfer(to, amount);

    // account와 account 간의 거래이므로, BankAccount 클래스의 transfer 메소드를 써야함.
    public boolean transfer(BankAccount to, int amount) {
        return account.transfer(to, amount);
    }

    public void sayHello() {
        System.out.println("Hi. My name is "+ this.name);
    }
}

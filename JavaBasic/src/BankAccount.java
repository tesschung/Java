public class BankAccount {
    // property
    private int balance;
    private Person owner;

    // method

    public BankAccount(int pBalance) {
        balance = Math.max(pBalance, 0);
    }

    public BankAccount(Person pOwner) {
        owner = pOwner;
        balance = 0;
    }

    public BankAccount(int pBalance, Person pOwner) {
        if (pBalance < 0) {
            balance = 0;
        } else {
            balance = pBalance;
        }
        owner = pOwner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int pBalance) {
        balance = pBalance;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person pOwner) {
        owner = pOwner;
    }


    // 파라미터: 입금할 액수(정수)
    // 리턴: 성공여부(불린)

    boolean deposit(int amount) {
        if (amount >= 0 && amount <= owner.getCashAmount()) {
            balance += amount;
            owner.setCashAmount(owner.getCashAmount() - amount);
            System.out.println(amount + "원 입금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return true;
        } else {
            System.out.println("입금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        }
    }


//    public boolean depositUSD(double amount, double exchangeRate) {
//        // int 로 casting
//        return deposit((int) (amount*exchangeRate));
//    }
//
//    public boolean depositJPN(double amount, double exchangeRate) {
//        // int 로 casting
//        return deposit((int) (amount*exchangeRate));
//    }

    // 메소드 오버로딩 (method overloading) - 클래스 내에 같은 이름의 메소드를 2개 이상 정의
    // 이름은 같지만 파라미터 개수가 다르다.
    public boolean deposit(double amount, double exchangeRate) {
        System.out.println(
                "deposit with exchange rate"
        );

        return deposit((int) (amount * exchangeRate));
    }
    // 파라미터: 출금할 액수(정수)
    // 리턴: 성공여부(불린)

    boolean withdraw(int amount) {
        if (amount >= 0 && amount <= balance) {
            balance -= amount;
            owner.setCashAmount(owner.getCashAmount() + amount);
            System.out.println(amount + "원 출금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return true;
        } else {
            System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        }
    }

    // 첫 번째 파라미터: 받는 사람 (Person)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(BankAccount to, int amount) {
        boolean success; // 성공 여부를 보관하는 변수 정의

        if (amount < 0 || amount > balance) {
            success = false;
        } else {
            balance -= amount;
            to.balance += amount;
            success = true;
        }

        System.out.println(success + " - from: " + owner.getName()
                + ", to: " + to.owner.getName()
                + ", amount: " + amount
                + ", balance: " + balance);

        return success;
    }

    // account와 account 간의 거래이므로, Person to의 정보를 to의 account 정보로 바꾸어 호출.
    public boolean transfer(Person to, int amount) {
        return transfer(to.getAccount(), amount);
    }

}

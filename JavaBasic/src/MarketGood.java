public class MarketGood {
    // 변동될 일이 없는 정보이므로 final로 설정한다.
    public final String name; // 상품의 이름 // final
    public final int retailPrice; // 상품의 출시 가격 // final
    private int discountRate; // 상품의 할인율 단위 %

    public MarketGood(String name, int retailPrice, int discountRate) {
        if (discountRate >= 0 && 100 >= discountRate) {
            this.discountRate = discountRate;
        } else {
            this.discountRate = 0;
        }
        this.retailPrice = retailPrice;
        this.name = name;
    }

    public MarketGood(String name, int retailPrice) {
        this(name, retailPrice, 0);
    }

    // discountRate는 변동이 있을 수 있으므로 setter & getter 모두 생성
    public int getDiscountRate(){
        return this.discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getDiscountedPrice() {
//        double M3 = this.discountRate*0.01; // M3는 %를 소수점으로 변환한 값이다 즉 20%를 0.2로 변환한다
//        System.out.println(this.discountRate);
//        double yourmoney = this.retailPrice*M3; // 할인되는 가격
//        System.out.println(this.retailPrice);
//        double actually = this.retailPrice-yourmoney; // 실제 가격
//        System.out.println(actually);
        return (int) (retailPrice * (1 - discountRate / 100.0));
    }
}

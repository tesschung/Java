public class MarketDriver {
    public static void main(String[] args) {
        MarketGood g1 = new MarketGood("MacBook Air", 1250000);
        MarketGood g2 = new MarketGood("MacBook Pro", 2990000, 15);
        MarketGood g3 = new MarketGood("iPhone 7", 920000, 20);

        System.out.println(g1.name + "의 할인율: "
                + g1.getDiscountRate() + "%");
        System.out.println(g2.name + "의 할인율: "
                + g2.getDiscountRate() + "%");
        System.out.println(g3.name + "의 정상 가격: "
                + g3.retailPrice + "원");
        System.out.println(g3.name + "의 할인 가격: "
                + g3.getDiscountedPrice() + "원");
        System.out.println("경쟁 업체가 많아져서 " + g3.name
                + "의 할인율이 35%로 올랐습니다.");
        g3.setDiscountRate(35);
        System.out.println(g3.name + "의 할인 가격: "
                + g3.getDiscountedPrice() + "원");
    }
}

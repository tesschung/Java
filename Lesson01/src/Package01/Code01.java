package Package01;

public class Code01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		byte byteValue = 10;
		int intValue = byteValue;
		double doubleValue = intValue;
		int intDoubleValue = (int) doubleValue;
		System.out.println(intValue);
		System.out.println(intDoubleValue);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(doubleValue);
		double x = 0.0;
		int a = 10;
		double z = a % x;
		
		try {
			System.out.println(z);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없다.");
		}
		
		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가.");
		} else {
			System.out.println(z);
		}
		
	}

}

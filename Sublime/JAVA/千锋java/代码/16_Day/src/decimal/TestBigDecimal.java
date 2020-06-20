package decimal;

import java.math.BigDecimal;

public class TestBigDecimal {

	public static void main(String[] args) {

		BigDecimal bg1 = new BigDecimal("2.2");
		BigDecimal bg2 = new BigDecimal("1.2");

		BigDecimal result1 = bg1.add(bg2);

		System.out.println(result1);

		BigDecimal result2 = bg1.subtract(bg2);

		System.out.println(result2);

		BigDecimal result3 = bg1.multiply(bg2);

		System.out.println(result3);
		
		BigDecimal result4 = bg1.divide( bg2, 2, BigDecimal.ROUND_HALF_UP );

		System.out.println(result4);

	}

}

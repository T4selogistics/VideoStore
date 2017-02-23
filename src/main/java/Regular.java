import java.math.BigDecimal;

public class Regular extends Movie {

	public Regular(String title, String priceCode) {
		super(title, "Regular");
	}

	@Override
	public BigDecimal calculateFees(int days) {
		BigDecimal amount = new BigDecimal("2.00");
		if(days > 2){
			BigDecimal extraDays = new BigDecimal (days - 2);
			amount = amount.add(new BigDecimal("1.50").multiply(extraDays)); 
		}		
		return amount;

	
	}
	}




import java.util.ArrayList;
import java.util.Collection;

public class RentalStatement {

	Collection<Rental> rentals = new ArrayList<>();
	
	public void add(Rental toAdd){
		rentals.add(toAdd);
		
	}
		
public void print(){
	for (Rental rental : rentals){
		
		System.out.println("PriceCode: " + rental.getPriceCode());
		System.out.println("Title:" + rental.getTitle());
		System.out.println("days:" + rental.getDays());
		System.out.println("The total cost will be" + rental.calculateFees());
		
	}
}
}

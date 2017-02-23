
public class VideoStoreApp {
	
	public static void main(String[]args) {
		
		RentalStatement statement = new RentalStatement();
		
		
		Movie regular = new Regular("WCCI","regularMovie");
		Movie childrens = new ChildrensMovie("Up", "childrensMovie");
		Movie newRelease = new NewRelease("Dr Strange");
	
		Rental regularMovie = new Rental(regular, 3);
		Rental childrensMovie = new Rental(childrens, 3);
		Rental release = new Rental(newRelease, 3);
		
		
		
	statement.add(regularMovie);
	statement.add(childrensMovie);
	statement.add(release);
	
	
	
	statement.print();
	}

}

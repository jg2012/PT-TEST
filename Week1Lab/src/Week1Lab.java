
public class Week1Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a variable to hold the quantity of available seats left on a flight
		int availablePlaneSeats = 10;
		// create a variable to hold the cost of groceries at checkout
		double groceriesCost = 23.64;
		//create a variable to hold a person's middle initial
		char middleInitial = 'L';
		// create a variable to hold true if it's hot outside and false if it's cold outside; 
		boolean hotOutside = false; 
		
		 
		
		//create a variable that hold a customers first name
		String firstName = "Jose"; 
		
		//create a variable to hold a street address
		String streetAddress = "1413 Dodge Ave"; 
		
		// print all variables to the console
		System.out.println("Available Seats on the Plane" + " " + availablePlaneSeats);
		System.out.println(groceriesCost + " "+ "Is the price of grocieries"); 
		System.out.println("The persons's Middle Initial is" + " " + middleInitial);
		System.out.println("Is it hot outside" + " " + hotOutside); 
		System.out.println(firstName + " " +  "is the person's first name.");
		System.out.println(streetAddress + " " + "Is where the person lives.");
		
		// a customer bought 2 plane seats from the available seat variable
		availablePlaneSeats = availablePlaneSeats - 2; 
		System.out.println("There are now" + " " + availablePlaneSeats + " " + "seats left");
		
		//impulse candy bar purchase, add 2.15 to the grocery total
		groceriesCost += 2.15;
		System.out.println(groceriesCost + " " + "Was now spent on groceries.");
		
		//birth certificates was printed incorrectly, change the middle initial to something else. 
		middleInitial = 'C' ; 
		System.out.println(middleInitial);
		
		
		//the season has changed, update the hot outside variable of what it was 
		hotOutside = !hotOutside; 
		System.out.println(hotOutside);
		
		//create a new variable called full name using the cusomter's full name, the middle initial, and a last name of your choice. 
		String fullName = firstName + " " + middleInitial + " Guzman"; 
		System.out.println(fullName);
		
		//print a line in the console that introduces the customer and says they live at the address variable. 
		System.out.println("Hi my name is" + " " + fullName + " " + "my street address is" + " " + streetAddress);
				
		
	
		
		
		
	}

}
 
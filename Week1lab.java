
public class Main {

	public static void main(String[] args) {
		//create a variable to hold the quantity of available plane seats left on a flight
				int planeseatsAvailable = 5;
				
				//create a variable to hold the cost of groceries at checkout
				double costGroceries = 12.50;
				
				//create a variable to hold a person's middle initial
				char middleInitial = 'P';
				
				//create a variable to hold true if it's hot outside and false if it's cold outside
				boolean isHotOutside = false;
				
				//create a variable to hold a customer's first name
				String customerFirstName = "Bob";
				
				//create a variable to hold a street address
				String streetAddress = "1077 Eclipse St.";
				
				//print all variables to the console
				System.out.println(planeseatsAvailable);
				System.out.println(costGroceries);
				System.out.println(middleInitial);
				System.out.println(isHotOutside);
				System.out.println(customerFirstName);
				System.out.println(streetAddress);
				
				
				//a customer booked 2 plane seats, remove 2 seats from the available seats variable
				planeseatsAvailable = planeseatsAvailable + 2;
				System.out.println(planeseatsAvailable);
				
				//impulse candy bar purchase, add 2.15 to the grocery total
				//costOfGroceries = costOfGroceries + 2.15;
				costGroceries = costGroceries + 2.15;
				
				//birth certificate was printed incorrectly, change the middle initial to something else
				middleInitial = 'B';
				
				//the season has changed, update the hot outside variable to be opposite of what it was
				isHotOutside = true;
				
				//create a new variable called full name using the customer's first name, the middle initial, and a last name of your choice
				String fullName = customerFirstName + " " + middleInitial + ". Mendleson";
				//print a line to the console that introduces the customer and says they live at the address variable
				System.out.println(fullName + " currently lives at " + streetAddress);

	}

}

package shirt_project;
import java.util.Scanner;
public class Driver1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ShirtService service=new ShirtService();
		char c;
		do {
			System.out.println("Press 1 to Add Shirt");
			System.out.println("Press 2 to Access all shirts");
			System.out.println("Press 3 to search on brand");
			System.out.println("Press 4 to search on price and color");
			System.out.println("Press 5 to sort shirt on low to High Price");
			System.out.println("Press 6 to get Number of Shirts of brand");
			int choice=sc.nextInt();
			switch(choice) {
				case 1:
					System.out.println("You have selected to add shirts:");
					service.addShirt(new Shirt("arrow", 40, 2300, "white"));
					break;
				case 2: 
					service.getAllShirts();
					break;
				case 3:
					service.getShirtByBrand("arrow");
					break;
				default:
					System.out.println("Not the valid choice");
			}
			System.out.println("Press Y/y to continue...");
			c=sc.next().charAt(0);
		}while(c=='Y'|| c=='y');
		System.out.println("===Application close===");
	}

}
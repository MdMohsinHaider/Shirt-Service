package shirt_project;
import java.util.*;
public class Driver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ShirtService service=new ShirtService();
		Shirt s1=new Shirt("arrow", 40, 2300, "blue");
		service.addShirt(s1);
		service.addShirt(new Shirt("blackberry", 42, 2800, "white"));
		service.addShirt(new Shirt("arrow", 40, 2900, "red"));
		service.addShirt(new Shirt("blackberry", 38, 1800, "white"));
		service.addShirt(new Shirt("levis", 42, 3800, "white"));
		service.addShirt(new Shirt("adidas", 40, 1500, "red"));
		service.addShirt(new Shirt("blackberry", 38, 4800, "white"));
		System.out.println("======Access All Shirts=========");
		service.getAllShirts();
		/*System.out.println("======Access All Shirts by Brand=========");
		System.out.println("Enter Brand: ");
		String brand=sc.nextLine();
		service.getShirtByBrand(brand);
		System.out.println("======Access All Shirts by Price and color=========");
		System.out.println("Enter min price: ");
		double min=sc.nextDouble();
		System.out.println("Enter max price: ");
		double max=sc.nextDouble();
		System.out.println("Enter Color: ");
		sc.nextLine();
		String color=sc.nextLine();
		service.getShirtByPriceAndColor(min, max, color);
		System.out.println("=====Sorted Shirts On Low To High Price====");
		service.sortShirtOnLowToHighPrice();
		System.out.println("=======Get All Brands===========");
		service.getAllBrands();
		System.out.println("========get Count of Brands======");
		service.getCountOfBrands();*/
		System.out.println("========get COunt of Size===========");
		service.getCountBySize();
		
		
	}

}
package shirt_project;
import java.util.*;
public class PriceLowToHighComparator implements Comparator<Shirt>{
	
	public int compare(Shirt s1, Shirt s2) {
	return (int)(s1.price-s2.price);
	}

}
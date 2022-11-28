
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client{
	
public static void main(String[] args) {
		

		//Initialise some household
		List<HouseholdItem> householdItmes= new ArrayList<>();

		
		Electronic microwaveOven= new Electronic("Microwave Oven",37, 48, 27, 13, false);
		Electronic tv= new Electronic("TV",122, 73, 15, 18, true);
		
		Glass wineGlass= new Glass("Wine glasses",33,28,23,1);
		Glass coffeeTable= new Glass("Glass Coffee Table ",80,80,45,3);

		
		Furniture bed= new Furniture("Bed", "Metal", 205, 91, 94, 26);
		Furniture cupboard= new Furniture("Bookshelf", "Wood", 60, 31, 190, 25);
		
		
        List<HouseholdItem> namesList = Arrays.asList(microwaveOven,tv,wineGlass,coffeeTable,bed,cupboard );
        householdItmes.addAll(namesList);
        
        ImplementItemVisitor a= new ImplementItemVisitor();
		
  System.out.println("Total Cost for TV is: " + a.visit(tv)  + " euros");
  System.out.println("Total Cost for Microwave Oven is: " + a.visit(microwaveOven)  + " euros");
  System.out.println("Total Cost for Wine glasses is: " + a.visit(wineGlass)  + " euros");
  System.out.println("Total Cost for Glass Coffee Table is: " + a.visit(coffeeTable)  + " euros");
  System.out.println("Total Cost for Bed is: " + a.visit(bed)  + " euros");
  System.out.println("Total Cost for Bookshelf is: " + a.visit(cupboard)  + " euros");
  System.out.println("   ");
//  packing
  System.out.println("Microwave:");
  System.out.println(" >should be covered with Polyethylene foam film and packed in a box with dimension: " + a.packing(microwaveOven));
  System.out.println("TV:");
  System.out.println(" >should be covered with Polyethylene foam film and packed in a box with dimension: " + a.packing(tv));
  System.out.println("Wine glasses:");
  System.out.println(" >should be wrapped with Bubble wraps and packed in a box with dimension: " + a.packing(wineGlass));
  System.out.println("Glass Coffee Table:");
  System.out.println(" >should be wrapped with Bubble wraps and packed in a box with dimension: " + a.packing(coffeeTable));
  System.out.println("Bed:");
  System.out.println(" >should be covered with waterproof covers with area of: " + a.packing(bed));
  System.out.println("Bookshelf:");
  System.out.println(" >should be covered with waterproof covers with area of: " + a.packing(cupboard));
  
}

	
}


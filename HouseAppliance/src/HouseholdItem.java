
public interface HouseholdItem {

	
	public double accept(ItemVisitor visitor); 
	public String packing(ItemVisitor visitor);	
}

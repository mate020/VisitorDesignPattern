
public interface ItemVisitor {


	double visit(Electronic electronic);
	double visit(Glass glass);
	double visit(Furniture furniture);
	
	String packing(Electronic electronic);
	String packing(Glass glass);
	String packing(Furniture furniture);
}

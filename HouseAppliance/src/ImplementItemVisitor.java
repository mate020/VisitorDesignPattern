
public class ImplementItemVisitor implements ItemVisitor {

	@Override
	public double visit(Electronic electronic) {
		double price = 0;
		boolean fragile = electronic.getFragile();
		double weight = electronic.getWeight();
		if (fragile == true) {
			price = 0.5 * weight;
		} else {
			price =  0.3333333333333333 * weight;
		}
		return price;
	}

	@Override
	public double visit(Glass glass) {
		double price = 0;
		double a = glass.getTickness();
		double b = glass.getLenght();
		b=b/100;
		if (a == 1) {
			price = 2 * b;
		}
		if (a == 2) {
			price = 1.2 * b;
		}
		if (a == 3) {
			price = 0.7 * b;
		}
		return price;
	}

	@Override
	public double visit(Furniture furniture) {
		double price = 0;
		double weight = 0;
		weight = furniture.getWeight();
		price = 0.25 * weight;

		return price;
	}

	@Override
	public String packing(Electronic electronic) {
		int height= electronic.getHeight()+1;
		int lenght= electronic.getLenght()+1;
		int width=electronic.getWidth()+1;
		
		String h= Integer.toString(height);
		String l =Integer.toString(lenght);
		String w= Integer.toString(width);
		
		String answer= h + " x " + l+ " x "+ w;
		
		return answer ;
	}

	@Override
	public String packing(Glass glass) {
		int height=glass.getHeight()+1;
		int lenght=glass.getLenght()+1;
		int width=glass.getWidth()+1;
		
		String h = Integer.toString(height);
		String l= Integer.toString(lenght);
		String w= Integer.toString(width);
		
		String answer= h+ " x "+ l + " x "+ w;
		
		return answer;
	}

	@Override
	public String packing(Furniture furniture) {
		
		int lenght=furniture.getLenght();
		int width=furniture.getWidth();
		
		
		String l= Integer.toString(lenght);
		String w= Integer.toString(width);
		
		String answer= l + " x "+ w;
		return answer;
	}

	
}

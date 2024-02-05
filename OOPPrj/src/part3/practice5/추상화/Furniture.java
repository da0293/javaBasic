package part3.practice5.추상화;

public class Furniture extends Product{
	private double furnitureDiscount; 
	public Furniture() {
		this("",0, 0, 0); 
	}
	public Furniture(String name, int price, int quantity, int furnitureDiscount) {
		super(name, price, quantity); 
		this.furnitureDiscount=furnitureDiscount;
	}
	@Override
	public int calculateTotal() {
		int total = (int) (onTotal() * furnitureDiscount / 100.0);
		return 0;
	}
}

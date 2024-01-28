package part3.practice5.추상화;

public abstract class Product {
	String name;
	int price; 
	int quantity;
	
	public Product() {
		this("Undefined", 0, 0);
	}
	
	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int calculateTotal() {
		return price * quantity;
	}
	
	public int applyDiscountedTotal(double discountRate) {
		int discountedPrice = (int)(calculateTotal() * (1-discountRate/100));
		return discountedPrice; 
	}
	
	public int applyDiscountedForOne(double discountRate) {
		return (int)(price * (1 - discountRate / 100));
    }
}

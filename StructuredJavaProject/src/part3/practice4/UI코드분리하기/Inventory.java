package part3.practice4.UI코드분리하기;

public class Inventory {
	private Product[] products;
	private int current; 
	
	public Inventory() {
		this(5);
	}	
	
	public Inventory(int size) {
		this.products = new Product[size]; 
		this.current=0; 
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public int size() {
		return this.current;
	}

	// 상품을 재고목록에 추가 
	public void add(Product product) {
		Product[] products = this.products;
		int size = this.size(); 
		if(products.length==size) {
			Product[] temp = new Product[size+3]; 
			for( int i=0; i<size; i++) {
				temp[i]=products[i]; 
			}
			products = temp;
			this.products=products;
		}
		products[size]=product;
		current++;
	}

	public Product get(int i) {
		return products[i];
	}
}

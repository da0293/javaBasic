import part3.practice4.UI코드분리하기.Product;

public class saleProduct extends Product{
	private double discountRate;
	
	public saleProduct() {
		this("Undefined", 0, 0, 0);
	}
	
	public saleProduct(String name, int price, int quantity, double discountRate) {
		super(name, price, quantity);
		this.discountRate = discountRate; 
	}
	
	public double getDiscountRate() {
		// 퍼센트로 반환
		return discountRate * 100; 
	}

	public void setDiscountRate(double discountRate) {
		// 퍼센트 값으로 변환하여 저장
		this.discountRate = discountRate / 100;
	}

	// 기존 calculateTotal()을 재정의 : 할인율까지 적용한 총 수량 * 가격
	@Override
	public int calculateTotal() {
		return (int)(super.calculateTotal()* (1 - this.discountRate / 100));
	}
	
	// 물건 하나 당 할인된 가격
	public int calculatePriceforOne() {
		return (int)(getPrice() * (1 - this.discountRate / 100));
    }
}

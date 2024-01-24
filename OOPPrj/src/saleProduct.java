import part3.practice4.UI코드분리하기.Product;

public class saleProduct extends Product{
	private double discountRate;
	
	
	public double getDiscountRate() {
		// 퍼센트로 반환
		return discountRate * 100; 
	}


	public void setDiscountRate(double discountRate) {
		// 퍼센트 값으로 변환하여 저장
		this.discountRate = discountRate / 100;
	}

	// 물건 하나 당 할인된 가격
	public int calculateDiscountedPriceforOne() {
		return (int)(getPrice() * (1 - this.discountRate / 100));
    }
	
	// 총 수량에 대한 총 가격에서 할인된 가격
	public int calculateDiscountedTotalPrice() {
        return (int)(this.calculateTotal() * (1 - this.discountRate / 100));
    }
}

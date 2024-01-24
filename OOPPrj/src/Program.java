

public class Program {
	public static void main(String[] args) {
		saleProduct product = new saleProduct();
		product.setName("체크셔츠");
		product.setPrice(30000);
		product.setQuantity(100);
		product.setDiscountRate(10); // 할인율 
		System.out.println(product.calculateDiscountedPriceforOne());
		System.out.println(product.calculateDiscountedTotalPrice());
	}
}

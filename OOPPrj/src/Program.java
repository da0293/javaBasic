import part3.practice4.UI코드분리하기.Product;

public class Program {
	public static void main(String[] args) {
		saleProduct product = new saleProduct("체크셔츠", 30000, 100, 10);
		System.out.println(product.calculatePriceforOne());
		System.out.println(product.calculateTotal());
	}
}

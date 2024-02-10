package part3.practice5.추상화;

public class FurnitureConsole extends InventoryConsole {
	@Override
	protected Product makeProduct() {
		return new Furniture();
	}

	@Override
	protected void onInput() {
		// TODO Auto-generated method stub
		
	}

}

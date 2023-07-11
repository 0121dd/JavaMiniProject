package project;

public class Water extends VendingMachine implements DrinkInterface {

	@Override
	public void choiceDrink() {
		System.out.println("=================");
		System.out.println("물을 선택했습니다.");
	}
	
	public void changeMoney(int money) {
		int chanMoney = money - 1000;
		System.out.println("잔돈은 " + chanMoney + "원입니다.");
	}


}




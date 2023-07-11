package project;

public class Soda extends VendingMachine implements DrinkInterface{

	@Override
	public void choiceDrink() {
		System.out.println("=================");
		System.out.println("탄산음료를 선택했습니다.");
	}

	public void changeMoney(int money) {
		int chanMoney = money - 1300;
		System.out.println("잔돈은 " + chanMoney + "원입니다.");
	}

}

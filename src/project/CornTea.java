package project;

public class CornTea extends VendingMachine implements DrinkInterface {

	@Override
	public void choiceDrink() {
		System.out.println("=================");
		System.out.println("옥수수수염차를 선택했습니다.");
	}

	public void changeMoney(int money) {
		int chanMoney = money - 1500;
		System.out.println("잔돈은 " + chanMoney + "원입니다.");
	}

}

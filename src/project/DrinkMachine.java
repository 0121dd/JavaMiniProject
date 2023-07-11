package project;
// CoinMachine에서 인터페이스 객체 생성을 위해
public class DrinkMachine {

	public void drinks(DrinkInterface drinkInterface, int money) {
		drinkInterface.choiceDrink();
		drinkInterface.changeMoney(money);
		
	}
}

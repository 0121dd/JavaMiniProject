package project;

public class VendingMachine {
	private int money;
	private int choiceDrinkNum;
	
	public VendingMachine() {
		money = 0;
		choiceDrinkNum = 0;
	}
	
	public VendingMachine(int money, int choiceDrinkNum) {
		this.money = money;
		this.choiceDrinkNum = choiceDrinkNum;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getChoiceDrinkNum() {
		return choiceDrinkNum;
	}
	public void setChoiceDrinkNum(int choiceDrinkNum) {
		this.choiceDrinkNum = choiceDrinkNum;
	}
	
	
}

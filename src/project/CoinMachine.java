package project;

public class CoinMachine {
	private int money;
	private int songCount;
	
	public CoinMachine() {
		money = 0;
		songCount = 0;
	}
	
	public CoinMachine(int money, int songCount) {
		this.money = money;
		this.songCount = songCount;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getSongCount() {
		return songCount;
	}

	public void setSongCount(int songCount) {
		this.songCount = songCount;
	}
	
}

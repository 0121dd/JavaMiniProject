package project;

import java.util.Scanner;

public class CoinMachineFunction {
	public void printMenu1(CoinMachine csr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("기계에 돈을 넣어 주세요.");
		System.out.println("< 500원에 1곡 >");
		System.out.println("< 1000원에 3곡 >");
		System.out.println("< 5000원에 16곡 >");
		System.out.print("넣을 돈 : ");
		int money = sc.nextInt();
		csr.setMoney(money);
	}
	public void inputMoneySongCount(CoinMachine csr) {
		int money = (csr.getMoney()) /1000;
		int songCount = csr.getSongCount();
		// 천원단위만 가능하게 하려면?
		if(money == 500) {
			songCount = songCount + 1;
		}else if(money == 1000) {
			songCount = songCount + 3;
		}else if(money == 5000) {
			songCount = songCount + 16;
		}else {			
			songCount = songCount + ((int)(money / 1000) * 3);
		}
		csr.setSongCount(songCount);
	}
	public int printMenu2(CoinMachine csr) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("남은 곡수 : " + csr.getSongCount());
		System.out.println("1. 노래부르기");
		System.out.println("2. 돈 더 넣기");
		System.out.println("3. 음료 사기");
		System.out.println("4. 그만하고 나가기");
		System.out.print("메뉴 입력 : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void singSangSong(CoinMachine csr) {
		int songCount = csr.getSongCount();
		songCount--;
		csr.setSongCount(songCount);
	}
	 public int buyDrink(VendingMachine vm) {
		 Scanner sc =  new Scanner(System.in);
		 System.out.println();
		 System.out.println("==== 자판기 ====");
		 System.out.println("1. 물 >> 1000원");
		 System.out.println("2. 옥수수수염차 >> 1500원");
		 System.out.println("3. 토레타 >> 1700원");
		 System.out.println("4. 탄산음료 >> 1300원");
		 System.out.print("넣을 돈 : ");
		 int money = sc.nextInt();
		 vm.setMoney(money);
		 System.out.print("음료 선택 : ");
		 int choice2 = sc.nextInt();
		 vm.setChoiceDrinkNum(choice2);
//		 System.out.println(vm.getMoney() + ", " +  vm.getChoiceDrinkNum());
		 return choice2;
	 }
}

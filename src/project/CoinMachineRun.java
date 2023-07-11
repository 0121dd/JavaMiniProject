package project;

public class CoinMachineRun {
	public static void main(String[] args) {
		CoinMachine csr = new CoinMachine();
		VendingMachine vm = new VendingMachine();
		CoinMachineFunction cmFunc = new CoinMachineFunction();
			end:
			while(true) {
				int choice = 0;
				int choice2 = 0;
				if(csr.getMoney() == 0) {	
					System.out.println("코인 노래방에 오신걸 환영합니다.");
					cmFunc.printMenu1(csr);
					cmFunc.inputMoneySongCount(csr);
				}else {					
					choice = cmFunc.printMenu2(csr);
				}
				switch(choice) {
				case 1 : 
					cmFunc.singSangSong(csr);
					if(csr.getSongCount() == 0) {
						System.out.println();
						System.out.println("코인을 다 소진하였습니다.");
						System.out.println("더 하실거면");
						cmFunc.printMenu1(csr);
						cmFunc.inputMoneySongCount(csr);
					}
					break;
				case 2 :
					System.out.println();
					cmFunc.printMenu1(csr);
					cmFunc.inputMoneySongCount(csr);
					break;
				case 3 : 
					DrinkMachine dm = new DrinkMachine();
					choice2 = cmFunc.buyDrink(vm);
					switch(choice2) {
						case 1 : dm.drinks(new Water(),vm.getMoney());
							break;
						case 2 : dm.drinks(new CornTea(),vm.getMoney());
							break;
						case 3 : dm.drinks(new Toreta(),vm.getMoney());
							break;
						case 4 : dm.drinks(new Soda(),vm.getMoney());
							break;
					}
					break;
				case 4 : System.out.println("이용해주셔서 감사합니다.");
					break end;
				} 
			}

	}
	
	 
}

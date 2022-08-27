package week3.day3;

public class IciciBank extends BankInformation{
	public void deposit() {
		System.out.println("Deposit in Icici Bank: 5000rs");
		//super.deposit();
	}

	public static void main(String[] args) {
		
		IciciBank a = new IciciBank();
		BankInformation ab=new BankInformation();
		ab.deposit();
		a.deposit();
		a.fixed();
		a.saving();

	}

}

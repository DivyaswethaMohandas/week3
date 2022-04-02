package week3.day1;

public class AxisBank extends BankInfo {
public void deposit() {
	System.out.println("Overriding the method deposit --new");
}
	public static void main(String[] args) {
		AxisBank obj2=new  AxisBank();
		obj2.saving();
		obj2.fixed();
		obj2.deposit();
			
	}

}

package week3.day1.assigment3;

public class AxisBank extends BankInfo{

	public static void main(String[] args) {
		
		AxisBank axis = new AxisBank();
		axis.deposit();
		axis.fixed();
		axis.saving();
	}
	public void deposit() {
		System.out.println("This method is for axis bank deposit");
	}
}

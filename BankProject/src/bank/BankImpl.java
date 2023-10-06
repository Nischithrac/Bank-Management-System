package bank;
import org.InsuffcientBlanceException;

public class BankImpl implements Bank {
	int balance;
	BankImpl(int balance){

		this.balance=balance;
	}
	@Override
	public void deposit(int amount) {
		System.out.println("Depositing! Rs "+amount);
		balance=balance+amount;//Balance +=amount
		System.out.println("Amount Depositing successfully! ");

	}

	@Override
	public void withdraw(int amount) {
		if(amount>=balance) {
			System.out.println(" the amount to withdraw "+amount);
			balance=balance-amount;//Balance -=amount
			System.out.println("Amount to withdraw successfully! ");
		}else {

			try {
				throw new InsuffcientBlanceException(" Insuffcient Balnce! ");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void checkBlance() {
		System.out.println("Available Balnce :Rs. "+balance);

	}
}
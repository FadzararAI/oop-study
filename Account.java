import java.text.NumberFormat;
public class Account {
	private final double RATE = 0.035; // interest rate of 3.5%
	private String name;
	private long acctNumber;
	private double balance;
	public Account (String owner, long account, double initial) {
		name = owner;
		acctNumber = account;
		balance = initial;
	}
//-----------------------------------------------------------------
// Deposits the specified amount into this account and returns
// the new balance. The balance is not modified if the deposit
// amount is invalid.
//-----------------------------------------------------------------
	public double deposit (double amount) {
		if (amount > 0)
			balance = balance + amount;
		return balance;
	}
	public double withdraw (double amount, double fee) {
		if (amount + fee > 0 && amount + fee < balance)
			balance = balance - amount - fee;
		return balance;
	}
//-----------------------------------------------------------------
// Adds interest to this account and returns the new balance.
//-----------------------------------------------------------------
	public double addInterest () {
		balance += (balance * RATE);
		return balance;
	}
	public double getBalance () {
		return balance;
	}
//-----------------------------------------------------------------
// Returns a one-line description of this account as a string.
//-----------------------------------------------------------------
	public String toString () {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
	}
}
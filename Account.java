
public class Account {
	private String Number;
	private double Balance;
	private String Name;
	private String Mail;
	private String PhoneNumber;
	
	public Account(String Number, double Balance, String Name, String Mail, String PhoneNumber) {
		
		this.Number = Number;
		this.Balance = Balance;
		this.Name = Name;
		this.Mail = Mail;
		this.PhoneNumber = PhoneNumber;
		
	}
	
	public void DepositMoney(double DepositedMoney) {
		this.Balance+=DepositedMoney;
		System.out.println("Deposit is successful, new balance is :"+this.Balance);		
	}
	
	public void WithDrawMoney(double WithDrawalMoney) {
		if(this.Balance - WithDrawalMoney < 0){
		System.out.println("WithDraw unsuccessful :"+this.Balance+ " Rs. is left");
		}
		else {
			this.Balance-= WithDrawalMoney;
			System.out.println("WithDraw successful, current Balance is:"+this.Balance);
		}
		
	}
	
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
}

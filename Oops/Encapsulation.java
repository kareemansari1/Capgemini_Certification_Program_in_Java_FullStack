package Oops;

/*Advantage of Encapsulation in Java
There are the following advantages of encapsulation in Java. They are as follows:
1. The encapsulated code is more flexible and easy to change with new requirements.
2. It prevents the other classes from accessing the private fields.
3. Encapsulation allows modifying the implemented code without breaking other code that has implemented the code.
4. It keeps the data and codes safe from external inheritance. Thus, encapsulation helps to achieve security.
5. It improves the maintainability of the application.
6. If you don’t define the setter method in the class, then the fields can be made read-only.
7. If you don’t define the getter method in the class, then the fields can be made write-only.
8. If you define both getter and setter methods in the class, then the fields can be made both read-write.*/
class Bank {
	private int accno; // Variables are Always in Private in Encapsulation.
	private String bname;
	private String hname;
	private int bal;
	private int ifsc;

	public Bank(int accno, String bname, String hname, int bal, int ifsc) {
		super();
		this.accno = accno;
		this.bname = bname;
		this.hname = hname;
		this.bal = bal;
		this.ifsc = ifsc;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}

	public int getIfsc() {
		return ifsc;
	}

	public void setIfsc(int ifsc) {
		this.ifsc = ifsc;
	}

}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank(123, "HDFC", "Kareem", 5001, 277);
		System.out.println("Bank Details");
		System.out.println("Account Number is : " + bank.getAccno());
		System.out.println("Bank Name is : " + bank.getBname());
		System.out.println("Account Holder Name is : " + bank.getHname());
		System.out.println("IFSC Code is : " + bank.getIfsc());
		System.out.println("Balance is : " + bank.getBal());

	}

}

package ObjectOriented;

public abstract class Bank {
	
	public abstract void Loan();
	
	public void Credit() {
		System.out.println("Credit---Non Abstract");
	}
	public void Debit() {
		System.out.println("Debit---Non Abstract");
	}

}

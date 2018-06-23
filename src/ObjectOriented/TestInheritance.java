package ObjectOriented;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HBSCBank H=new HBSCBank();
		H.Credit();
		H.Debit();
		H.Loan();
		H.Ton();
		Bank B=new HBSCBank();
		B.Credit();
		B.Debit();
		B.Loan();
		
		}

}

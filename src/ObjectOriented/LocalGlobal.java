package ObjectOriented;

public class LocalGlobal {
	String s="Rajesh";
	String name="Test";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		LocalGlobal lg=new LocalGlobal();
		System.out.println(i);
		System.out.println(lg.s);
		lg.sum();
		Sumov();
		int t=20;
	}
	public void sum() {
		int i=25;
		String s="Testing";
		System.out.println(s);
		System.out.println(i);
	}
	public static void Sumov() {
		int k=30;
		System.out.println(k);
	}

}


public class StringConc {

	public static void main(String[] args) {
		// TOD Auto-generated method stub
		int i=0;
		while(i<=10) {
			System.out.print("  "+i);
			i++;
		}
		System.out.println("");
		System.out.println("**************************");
		for(int j=10;j>=0;j--) {
			System.out.print("  "+j);
		}
		System.out.println("");
		int a=2;
		int b=a--;
		System.out.println(b);
		System.out.println(a);
		int x=2;
		int y=--x;
		System.out.println(x);
		System.out.println(y);
	}

}

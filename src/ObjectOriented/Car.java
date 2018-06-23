package ObjectOriented;

public class Car {
	static int Mod;
	static int Wheel;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mod=100;
		Wheel=200;
		System.out.println(Mod);
		System.out.println(Wheel);
		Car c=new Car();
		c.Test();
		//System.out.println(M.a);
		
		/*Car a=new Car();
		Car b=new Car();
		Car c=new Car();
		a.Mod=200;
		a.Wheel=300;
		b.Mod=100;
		b.Wheel=200;
		c.Mod=300;
		c.Wheel=400;
		System.out.println(a.Mod);
		System.out.println(a.Wheel);
		
		System.out.println(b.Mod);
		System.out.println(b.Wheel);
		System.out.println(c.Mod);
		System.out.println(c.Wheel);*/
	
	}
	public void Test() {
		int a=10;
		int b=20;
		System.out.println("Hello:"+a);
		//return b;
		
	}

}

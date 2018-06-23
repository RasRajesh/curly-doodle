package ObjectOriented;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListC {
	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add(100);
		ar.add("Rajesh");
		ar.add("Testing");
		System.out.println(ar.size());
		ar.remove(1);
		System.out.println("Array Content: "+ar);
		//for(int i=0; i<ar.size();i++) {
			//System.out.println(ar.get(i));
		//}
		Employee e1=new Employee("Naveen",27,"QA");
		Employee e2=new Employee("Rajehs",28,"Dev");
		Employee e3=new Employee("Tom",29,"RE");
		ArrayList<Employee> Em=new ArrayList<Employee>();
		Em.add(e1);
		Em.add(e2);
		Em.add(e3);
		Iterator<Employee> it=Em.iterator();
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.div);
		}
		
	}


}

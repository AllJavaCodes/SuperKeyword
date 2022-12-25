package SuperKeyword;


class Frog{
	String color="orange";
	void m1() {
		System.out.println("M1 methods");
		
		
	}
	
}

class Bee extends Frog{
	String  color="violet";
	void m2() {
		super.m1();
		System.out.println("Frog color is : "+super.color);
		System.out.println("Bee is : "+color);
		
	}
	
}
class Ant extends Bee{
	String color ="brown";
	{
		System.out.println("Hi");
		String s=super.color;										
		System.out.println("s is : "+s);
	}
	void m3(){
		super.m2();
		System.out.println("Ant color : "+color);
			
	}
	
}
public class Demo {
	public static void main(String[]rag) {
		Ant a=new Ant();
		a.m3();
		
		
	}

}

package SuperKeyword;


class Dog{
	String color="Black";
	static int i=99;
	
}

class Cat extends Dog{
	String color="Pink";
	void m1(){
													//	String r=super.color;
					System.out.println(i);								//	System.out.println(r);
		System.out.println(super.color);
		System.out.println("Hi I Am Cat");
		
	}
	
}
public class Animal {
	public static void main(String[]ars) {
		Cat c=new Cat();
		c.m1();
		System.out.println(c.color);
		
		//System.out.println(c.color);
		
	}

		
}

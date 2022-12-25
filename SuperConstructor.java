package SuperKeyword;

class A1{
	int a=78;
	
	A1(){
		System.out.println("A1 is : ");
	}
	
}

class B1 extends A1{
	//Default Constructor Contains Super() implicitly...
	B1(){
		System.out.println("B1 is : ");
	}
	{
		System.out.println(a);
		
	}

}

class C1 extends B1{
	int i=10;
	{
		System.out.println("i value is : "+i);		// non static Block
	}
	void m1() {
		System.out.println("M1 method of C1");
	}
	C1(){
		System.out.println("C1 is :"+a);
	}
	
}
public class SuperConstructor {

	public static void main(String[]args) {
		C1 c=new C1();
		c.m1();
		
		
	}
}

package SuperKeyword;

class U {
	U() {
		System.out.println("U ");

	}

	static{
		System.out.println("U Class : static block");		//static block

	}
	{
		System.out.println("Non static block for U");
	}
}

class V extends U {
	int u = 99;
	static {
		System.out.println("V static Block");			//static block
	}

	V() {
		//super(12);
		System.out.println("Class V is : ");
		//System.out.println(j);
	}


}

class G extends V {
	
	static {
		System.out.println("G for staic block");
	}
	
	
	

}

public class SuperCon {
	public static void main(String[] arsg) {
		G g = new G();

	}

}

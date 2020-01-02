package example.java8.defaultmethod;

public class MaClasse implements Interface1, Interface2 {

	@Override
	public void method2(String str) {
		System.out.println("method 2 : " + str);
		
	}

	@Override
	public void method1(String str) {
		System.out.println("method 1 : " + str);
	}
	
	
	public void log(String str) {
		System.out.println("log : " + str);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface1.print("from interface 1");
		
		MaClasse maClass = new MaClasse();
		
		maClass.method1("Hello M1");
		maClass.method2("Hello M2");
		maClass.log("method of MaClasse");
	}

}

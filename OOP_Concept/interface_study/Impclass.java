package interface_study;

public class Impclass implements Myinterface {

	public static void main(String[] args) {
		System.out.println("a");
		Impclass i=new Impclass();
		i.test();
		i.test1();
		i.test3();
		i.test4();
	}

	@Override
	public void test() {
	 System.out.println("method test completed in implementation class");
		
	}
	@Override
	public void test1() {
	System.out.println("method test1 completed in implementation class");
		
	}
	@Override
	public void test3() {
	System.out.println("method test2 completed in implementation class");
		
	}

	@Override
	public void test4() {
		System.out.println("method test4 completed in implementation class");
		
		
	}

}

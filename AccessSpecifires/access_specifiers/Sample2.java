package access_specifiers;

public class Sample2 {

	public static void main(String[] args) {
	System.out.println("This is a another class");
	Sample1 s1=new Sample1();
	s1.vaishali();//public
	s1.sourabh();//protected
	s1.reshma();//default
	//s1.jayant();no calling in private method

	}

}
//note----no calling in private method bcz this only the
// scope of within a class
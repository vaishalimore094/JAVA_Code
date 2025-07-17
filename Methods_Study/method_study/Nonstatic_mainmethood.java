package method_study;

public class Nonstatic_mainmethood {
	
	public static void main(String[] args)//defination of main method
	{
        System.out.println("i am a main method");	
        Nonstatic_mainmethood u1=new Nonstatic_mainmethood();//object creation(class name object = new classname )
        u1.March("vaishali");//(referance variable.unstatic method name)
        Nonstatic_diffmethod u2=new Nonstatic_diffmethod();//object creation for another class
        u2.april();//(referance variable.another class method name).
       int g = add(10,20);
       System.out.println("add :"+g);
     int h =add(10,20)*10;
     System.out.println(h);
       	}

public int March(String s)//defination of unstatic method for same class method
{
	
	int a=10;
	System.out.println("i am unstatic method");
	return a;
}
public static int add(int num1,int num2) {
	int res=num1+num2;
	
	return res;
}




	
}

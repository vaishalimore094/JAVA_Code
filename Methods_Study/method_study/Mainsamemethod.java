package method_study;

public class Mainsamemethod {

	public static void main(String[] args)//main method declaration
	{
		// Mainmethod.Mymethod();// regular static method call in same class
		Mymethod();
		methodsamedifference1_study.diffclassmethod();// regular static method call in another class
		//(another class name.another class method name)
         System.out.println("hi, iam a main method");

	}
	
	public static void Mymethod() // method with body is called method defination
	{
		System.out.println("hi,i am a my method");
	}

	

	}



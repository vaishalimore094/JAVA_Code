package keywords;

public class This_keyword {
    int a=100;//nonstatic global variable
    static int b=200;//static global variable
	public static void main(String[] args)
	{
		This_keyword t1=new This_keyword();//create object
		t1.display();
		
	}
	public void display()
	{
		int a=20;
		int b=30;
		int sum=a+b;
		System.out.println("value  of local variable is :"+a);//calling local variable a
		System.out.println("value of global variable is :"+ this.a);//calling global variable b
		System.out.println("value of local variable is   :"+b);
	    System.out.println("value of static global variable is :"+this.b);
		System.out.println("aadddition of local variable is :"+sum);
		System.out.println("adddition of global variable&local variable is :"+sum);
		//System.out.println("substraciton is"+sub);
	}
}
	

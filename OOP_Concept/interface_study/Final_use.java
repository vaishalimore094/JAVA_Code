package interface_study;

public class Final_use {
	int a=20;//global variable decleration
	final int b=40;//final global variable decleration
	 
	public static void main(String[] args) {
	Final_use m=new Final_use();
	m.money();
	m.money(50);
	Final_overriding f=new Final_overriding();
	f.add();
	m.add();

	}

 public final void money()
{
	System.out.println("value of  global a is :"+a);//global
      a=a+10;
      System.out.println("change value global a is :"+a);//change global value
     System.out.println("final value of b is :"+b);//final value 
    // b=b+30;dont change final value
}
public void money( int a)//overloading method
{
	System.out.println("value of a is :"+a);
	}
public void add()
{
	System.out.println("i am a method");
	}
}


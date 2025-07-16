package keywords;

public class Super_keyword extends This_keyword {
       int a=30;
       static int b=20;
	public static void main(String[] args) {
	Super_keyword d2=new Super_keyword ();
	d2.display1();
		}
      public void display1()
      {
    	  int a=20;
    	  int b=40;
    	  int sum=a+b;
    	System.out.println("addition of local variable is" +sum); 
    	System.out.println("value of global variable a is "+ this.a);
    	System.out.println("global value of super class variable is" +super.a);//access superclass value
    	
      }
 
}

package constructor_study;

public class CS3 {
	//-----------------------user defined constructor with parameter--------------------------------------------------------
	//================================================================================================
	int num1;//  nonstatic variable declaration
	int num2;//
	int num3;//
	public CS3()//user defined constructor without parameter
	{
	  num1=10;//variable inilization
	  num2=20;
	  num3=30;
	  }
	public CS3(int a)//user defined constructor with parameter
	{
		num1=a;//initizalition of a
	}
	public CS3(int b,int c)
	{
		num2=b;
		num3=c;          //note---------
	}
	public CS3(int a,int b,int c)
	{    
		  num1=a;
	      num2=b;
	      num3=c;
	      
	}    
   public static void main(String[] args)// define main method
	{
	  
     System.out.println("i am main method of with parameter");
     CS3 s3=new CS3();
     s3.addition();
     CS3 s4=new CS3(100);
     s4.addition();
     CS3 s5=new CS3(30,40);
     s5.addition();
     CS3 s6=new CS3(30,40,50);
     s6.addition();
     
    }
    public void addition() //define non static method
      {
    	int sum=num1+num2+num3;
    	System.out.println("addition of sum "+sum);
     }
    

   }


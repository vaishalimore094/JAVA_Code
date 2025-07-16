package constructor_study;
class CS4 {
	 int rollnum;      // global variable deleraction
	 float marks;
	 String name;
	  public CS4 () //userdefined constructor using without parameter
	 {
		 rollnum=10;   //variable initialization
		  marks=20.98f;
		  name="vaishali";
	 }
     public  CS4(int a)//userdefined constructor using with parameter
     {                                                       //===============Assignment================================
    	rollnum=a; 
     }
     public CS4(int a,float b )
     {
    	rollnum=a;
        marks=b;		 
     }
     public CS4(  int a,float b,String c)
     {
    	rollnum=a; 
    	marks=b;
    	name=c;
     }
	public static void main(String[] args)
	{
	
    System.out.println( "hi iam a main method with parameter");
      CS4 s4=new CS4();
      s4.cs1();
      CS4 s5=new CS4(20);
      s5.cs1();
      CS4 s6=new CS4(20,20.08f);
      s6.cs1();
      CS4 s7= new CS4(30 ,40.02f ,"jayant ");
      s7.cs1();
	}
	public void cs1()
	{
		System.out.println("-------------------------");
		System.out.println("i am nonstatic method with parameter ");
    	System.out.println( " Num is "+ rollnum);
		System.out.println(" marks is "+  marks);
		System.out.println(" name is "+ name);
	}
}

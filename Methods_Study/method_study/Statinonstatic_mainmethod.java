package method_study;

public class Statinonstatic_mainmethod {
	//

	public static void main(String[] args) 
	{
		vaishali();//call static method for same class
		Staticnonstatic_difference.nutan();//call static method for diff class
		Statinonstatic_mainmethod v1=new Statinonstatic_mainmethod();
		v1.jayant();
		Staticnonstatic_difference n1=new Staticnonstatic_difference();
		n1.vaibhav();
		
	System.out.println("hi,i am main method ");
	
  }
 public static void vaishali()
 {
	 System.out.println("hi,I am a static method"); 
	 
	
 }
 public void jayant()
 {
    System.out.println("hi,iam a non static method");
 }
}

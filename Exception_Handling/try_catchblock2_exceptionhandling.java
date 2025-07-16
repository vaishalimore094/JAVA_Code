package Exception_handling;

public class try_catchblock2_exceptionhandling {
	 
		  
	    public static void main(String[] args) {  
	        try  
	        {  
	        int data=50/0; //may throw exception   
	        }  
	            //handling the exception  
	        catch(ArithmeticException e)  
	        {  
	            System.out.println(e);  
	        }  
	        System.out.println("rest of the code");  
	    }  
	      
	}  
//-----output--------------------------------

//java.lang.ArithmeticException: / by zero
//rest of the code

//here the rest of the code is executed, i.e., the rest of the code statement is printed.
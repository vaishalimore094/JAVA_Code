package Exception_handling;

public class trycatchblock4_handleexceptionparentclass {

	
		
			  
		    public static void main(String[] args) {  
		       try  
		        {  
		        int data=50/0; //may throw exception   
		        }  
		            // handling the exception by using Exception class      
		        catch(Exception e)  
		        {  
		            System.out.println(e);  
		        }  
		        System.out.println("rest of the code");  
		    }  
	}

//output
//java.lang.ArithmeticException: / by zero
//rest of the code
//here,the rest of the block code will executed.
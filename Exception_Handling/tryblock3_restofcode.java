package Exception_handling;

public class tryblock3_restofcode {

	public static void main(String[] args) {
		try  
        {  
        int data=50/0; //may throw exception
        
       // if exception occurs, the remaining statement will not exceute  
        System.out.println("rest of the code");  
        }  
             // handling the exception   
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
          
    }  
	}

//output
//java.lang.ArithmeticException: / by zero
//Here, we can see that if an exception occurs in the try block, the rest of the block code will not execute.


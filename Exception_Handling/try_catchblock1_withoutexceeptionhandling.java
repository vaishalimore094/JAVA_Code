package Exception_handling;

public class try_catchblock1_withoutexceeptionhandling {

	public static void main(String[] args) { 
	          
	        int data=50/0; //may throw exception   
	          
	        System.out.println("rest of the code");  
	          
	    }  
	      

	}

//exception found---------------------------------------------------------------------output
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at Exception_handling.try_catchblock_withoutexceeptionhandling.main(try_catchblock_withoutexceeptionhandling.java:7)

//-------------------------------------------------------------------------------------------------------------
//here the rest of the code is not executed (in such case, the rest of the code statement is not printed).
//There might be 100 lines of code after the exception. If the exception is not handled, 
//all the code below the exception won't be executed.
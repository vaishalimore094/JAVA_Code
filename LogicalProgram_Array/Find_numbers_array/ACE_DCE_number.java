package Find_numbers_array;

import java.util.Arrays;

public class ACE_DCE_number {

	public static void main(String[] args) {
		//int array[]=new int[]---syntax of array
		//int rollno[]=new int[5];//decleration of array
		//int rollno[]= {1,56,5,4};
		
	     // rollno[0]=1;
	      //rollno[1]=56;
	     // rollno[2]=5;
	     // rollno[3]=4;
	     // System.out.println("total index length"+rollno.length);
		 // System.out.println("my rollno is"+rollno[1]);
		 // for(int i=0;i<=3;i++)
		//	{
		//		System.out.println(rollno [i]);
			
			//}
			
		int rollno[]= {1,56,5,4};
		
      Arrays.sort(rollno);//sorting array
//      System.out.println("--assendibg order---");
//      for(int i=0;i<=3;i++)//ini,con,inc/dec
//		{
//			System.out.print(rollno [i]);
//		
//		}
//      System.out.println("-------decending----");
      for(int i=rollno.length-1;i>=0;i--)
    	  
		{
			System.out.print(rollno [i]);
		
		}
   
     
     
      
	}

}

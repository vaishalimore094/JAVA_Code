package Star_patttern;

import java.util.Scanner;

public class left_increasing_decresing_triangelescanner {

	public static void main(String[] args) {
		  int rows;
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number of rows: ");
	 
	        rows = sc.nextInt();        
	        for (int i= 1; i<= rows ; i++)// outer row
	        {
	            for (int k=1; k<=i;k++) //inner col
	            
	            { 
	            	System.out.print("*");
	            } 
	            System.out.println();
	            
	            }
	        
	        for (int i=rows; i>=1; i--)//rows
	           {
	            
	            for(int k=1; k<i ;k++) //col
	            {
	                System.out.print("*");
	            }
	            System.out.println();
	 
	        }
	}

	}



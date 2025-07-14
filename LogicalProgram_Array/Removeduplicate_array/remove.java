package Removeduplicate_array;



public class remove {
     
		    public static void main(String[] args)
		    {
		        int a[] = {1,2,1,2,3,4,5,6,4,4,5,5};
		        int n = a.length;
		       int  temp;
		       // Arrays.sort(a);
		        for (int i = 0; i < n - 1; i++) 
		        {
		        	 for (int j=i+1; i < n-1; j++)
		        	 {
		               if (a[i] != a[j])
		               {
		            	   temp=a[i];
		                a[i] = a[j];
		                a[j] =temp;
		             }
		          }  
		       
		        
		            System.out.print(a[i]+" ");
		        }
		    }
		    }
		       
		   

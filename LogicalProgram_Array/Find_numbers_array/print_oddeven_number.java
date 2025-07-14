package Find_numbers_array;

public class print_oddeven_number {
	public static void main(String args[]){  
		int a[]={1,2,5,6,3,2};  
		System.out.println("Odd Numbers:");  
		for(int i=0;i<a.length;i++){  
		if(a[i]%2!=0){  
		System.out.print(a[i]);  
		}  
		}  
		System.out.println("Even Numbers:");  
		for(int i=0;i<a.length;i++){  
		if(a[i]%2==0){  
		System.out.print(a[i]);  
		}  
		}  
	}
}
//We can print odd and even numbers from an array in java by getting remainder of each element 
//and checking if it is divided by 2 or not.
//If it is divided by 2, it is even number otherwise it is odd number.
		  



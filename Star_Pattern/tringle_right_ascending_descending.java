package Star_patttern;

public class tringle_right_ascending_descending {

	public static void main(String[] args) {
		
			//----------------------------------------
			//        *****
			//         ****
			//          ***
			//           **
			//            *
			//           **
			//          ***
			//         ****
			//        *****
			//--------------------------------------
			//Step .1 Count Total no of Rows = 9; Use Outer for loop for No. of Rows
			int row = 9; //Count Total no of star in first Row
			int col=5;
			int space=0;
			
			for(int i=1; i<=row; i++) // Outer for loop used for No. of Rows
			{
			for(int j=1; j<=space; j++) // Inner for loop for Col
			{
			System.out.print(" ");
			}
			for(int k=1;k<=col;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
			if(i<5) // OR (i<=4) // For Descending star
			{
			space++;
			col--;
			
			
			}
			else // For Ascending star
			{
		   space--;
			col++;
			
			}
			
			
			
			
			
			

			}
}
}
			



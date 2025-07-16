package Star_patttern;

public class butterfly2_Scanner {

	public static void main(String[] args) {
			//*            *
			//**          **
			//***        ***
			//****      ****
			//*****    *****
			//****      ****
			//***        ***
			//**          **
			//*            * 
		//( Remember : Star Space Space Star)
		    int row=9;
			int col = 1; // Star on the first Row Left
			int space = 5; // Space on the first Row Left
			int col1 = 1; // Star on the first Row Right
			int space1 =4; // Space on the first Row Right
			for(int i=1; i<=row; i++) //Outer for loop used for No. of Rows = 9
			{
			for(int j=1; j<=col; j++) // Inner For loop for Star(Left)
			{
			System.out.print("*");
			}
			for(int k=1;k<=space; k++) // Inner For loop for space(Left)
			{
			System.out.print(" ");
			}
			for(int m=1; m<=space1; m++)
			{
			System.out.print(" ");
			}
			for(int l=1; l<=col1;l++)
			{
			System.out.print("*"); // Inner For loop for Star(Right)
			}
			if(i<5)
			{
			col++;
			space--;
			col1++;
			space1--;
			}
			else
			{
			col--;
			space++;
			col1--;
			space1++;
			}
			System.out.println();
			}
			}

	}



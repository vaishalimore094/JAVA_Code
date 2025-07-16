package Star_patttern;

public class Tringle_rightascending {

	public static void main(String[] args) {
		//    *
		//   **
		//  ***
		// ****
		//*****
		int space = 4; // Space in first row, space = 4
		int coloum = 1;
		int row=5;// star on first row, star = 1
		for(int i=1; i<=row; i++) // Outer loop for No of Rows = 5
		{
		for(int j=1; j<= space; j++) // 1st inner loop : Space
		{
		System.out.print(" "); // Don't Use Println()
		}
		for(int k=1; k<= coloum; k++)
		{
		System.out.print("*");
		}
		System.out.println();
		space--;
		coloum++;
		}
		}
		

	}



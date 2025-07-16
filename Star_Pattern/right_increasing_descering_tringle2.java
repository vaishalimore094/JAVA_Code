package Star_patttern;

public class right_increasing_descering_tringle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//          *
		//         **
		//        ***
		//       ****
		//        ***
		//         **
		//          *
		int row=7;
		int col = 1; // Total No of Star in First/Initial Row
		int space=3;
		for(int i=1; i<=row; i++) // Outer for loop for Total No of Rows=7
		{
			for( int k=1;k<=space;k++)//space count
			{
				System.out.print(" ");
			}
		for(int j=1; j<=col; j++) // Inner for loop for the column
		{
		System.out.print("*");
		}
		System.out.println();
		
		//star++;
		if(i<4) // if(i<=3) // for Increasing star; star++
		{
	space--;
	col++;
	
		}
		else // for Decreasing star; star--
		{
		
		space++;
		col--;
		}
		
		}
		
				

}


	}



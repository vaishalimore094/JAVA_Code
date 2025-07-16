package Star_patttern;

public class Triangle_equilateral_downword {

	public static void main(String[] args) 
	{
	        //  *******
			//   *****
			//    ***
			//     *
		
		int row=4;
		int col=7;
		int space=0;
		
		for(int i=1;i<=row;i++)
		  {
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=col;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			space++;
			col=col-2;
		}
	}
}
			
			
	


	



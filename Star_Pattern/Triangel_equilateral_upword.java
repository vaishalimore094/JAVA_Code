package Star_patttern;

public class Triangel_equilateral_upword {

	public static void main(String[] args) {
//		  *
//		 ***
//		*****
//	   *******
		int row=4;
		int col=1;
		int space=6;
		
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
			col=col+2;
			space=space-1;
			
		}
	}

	}



package Star_patttern;

public class Tringle_rightdecending {

	public static void main(String[] args) {
		
//			 *****
//			  ****
//			   ***
//			    **
//		         *
//			     
			int space = 0; // On the First Row there is no space, space = 0;
			int row = 5; 
			int col=5;
			for (int i=1; i<=row; i++)
			{
			for (int j=1; j<=space; j++ )//1st consider inner for loop for the Space
			{
			System.out.print(" ");// Use Single Space and on Print for Inner For Loop
			}
			for (int j=1; j<=col; j++)
			{
			System.out.print("*");
			}
			System.out.println();
			space++;
			col--;
			}
			}
			

	}



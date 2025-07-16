package Star_patttern;

public class Box {

	public static void main(String[] args) {
		//***--row3
		//***--coloumn 3
		//***--always srart outer loop(row)
		int row=3;
		int col=3;
//		int space=0;
		for(int i=1;i<=row;i++) 
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		

}
}
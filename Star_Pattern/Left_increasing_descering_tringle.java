package Star_patttern;

public class Left_increasing_descering_tringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//*
		//**
		//***
		//****
		//***
		//**
		//*
		int row=7;
		int col = 1; // Total No of Star in First/Initial Row
		for(int i=1; i<=row; i++) // Outer for loop for Total No of Rows=7
		{
		for(int j=1; j<=col; j++) // Inner for loop for the column
		{
		System.out.print("*");
		}
		System.out.println();
		//star++;
		if(i<4) // if(i<=3) // for Increasing star; star++
		{
		col++;
		}
		else // for Decreasing star; star--
		{
		col--;
		}
		}
	}


	}



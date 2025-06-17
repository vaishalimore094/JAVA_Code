package Find_Remove_sentWord;

public class Print_Firstletter_string {

	public static void main(String[] args) {
	     
		   String str = "Vaishal More";
	        String word = "";
	        String [] split = str.split(" ");

	        for(int i=0; i<split.length; i++)
	        {
	            word = split[i];

	            System.out.print(word.charAt(0));
	        }
	      
	}

}
		
	        

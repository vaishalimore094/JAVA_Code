package Find_Remove_sentWord;

public class Find_duplicateWord_String {
	public static void main(String[] args) {  
	String string = "Big black bug bit a big black dog on his big black nose";    
    int count;    
        
    //Converts the string into lowercase    
    string = string.toLowerCase();    
        
    //Split the string into words using built-in function    
    String words[] = string.split(" ");    
        
    System.out.println("Duplicate words in a given string : ");     
    for(int i = 0; i < words.length; i++) 
    {    
        count = 1;    
        for(int j = i+1; j < words.length; j++) 
        {    
            if(words[i].equals(words[j])) 
            {    
                count++;    
                //Set words[j] to 0 to avoid printing visited word    
                words[j] = "0";    
            }    
        }    

}
}
}

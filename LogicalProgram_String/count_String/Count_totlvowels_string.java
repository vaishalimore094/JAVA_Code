package count_String;

public class Count_totlvowels_string {

	
	public static void main(String[] args) {    
        
		String str = "Vaishamli";
        int Count = 0;   
            
         for(int i = 0; i < str.length(); i++) {    
          if(str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i'&& str.charAt(i) != 'o' && str.charAt(i) != 'u')
          {    
                Count++;
                //System.out.print(str.charAt(i));
            }    
            

}
        
        System.out.println(Count);
	}
}

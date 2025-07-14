package Replace_Remove_Char;

public class Remove_specialcharactor_string {

	public static void main(String[] args) {
		String s="Velocity@";
		String s1 = s.replace("@", "");
		System.out.println(s1);
		
		String  s2="V!el&ocit@y";
		
		String S3 = s2.replaceAll("[^a-zA-Z0-9]", "");

		System.out.println(S3);
	
		


	}

}

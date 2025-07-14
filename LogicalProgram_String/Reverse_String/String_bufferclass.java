package Reverse_String;

public class String_bufferclass {

	public static void main(String[] args) {
		String original="vaishali";
		//StringBuffer sb=new StringBuffer(original);
		StringBuilder sb=new StringBuilder(original);
		
		System.out.println("Print reverse string " + sb.reverse());
	}
}


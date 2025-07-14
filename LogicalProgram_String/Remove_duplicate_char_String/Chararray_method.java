package Remove_duplicate_char_String;

public class Chararray_method {

	public static void main(String[] args) {
		String str="Vaishali";
		char[]arr=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			boolean repetated=false;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) {
				repetated=true;
				break;
			}
		}
		if(!repetated) 
		{
			sb.append(arr[i]);
		}
	}
	System.out.println(sb);

	}
}
	

package Replace_Remove_Char;

public class Replace_allspecialchar {

	public static void main(String[] args) {
		String name = "V@ai@bh#av";
		String CorrectName = name.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(CorrectName);
		//System.out.println(str.replace("@", "").replace("#", ""));
		}

	}



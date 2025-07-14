package Plaondrome_String;

public class Palendrome_string {

	public static void main(String[] args) {

			// madam, nitin, radar, dad, mom, mam, nayan
					
					String org="NAYAN";
					
					String rev="";
					
					for (int i=org.length()-1;i>=0;i--)
					{
						rev=rev+org.charAt(i);
					}
					
					System.out.println("Org String is "+org);
					System.out.println("rev string is "+rev);

					if(org.equals(rev))
					{
						System.out.println("Given String is palindorme");
					}
					else
					{
						System.out.println("Given String is not palindorme");	
					}
					
				}

			}


	



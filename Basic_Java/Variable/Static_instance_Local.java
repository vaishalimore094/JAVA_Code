package Variable;

public class Static_instance_Local {
	static int a=20;//static variable
	int b=10;//instance variable



	public static void main(String[] args) {
		int c=30;//local variable
		System.out.println("local variable"+ c);
		Static_instance_Local ref=new Static_instance_Local();
		
		System.out.println("instance variable"+ref.b);
		System.out.println("static variable "+Static_instance_Local.a);

}
}
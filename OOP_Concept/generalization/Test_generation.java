package generalization;

public class Test_generation {

	public static void main(String[] args)
	{
		System.out.println("--------------KECSP college-----");
	KECSP k1=new KECSP();
	  k1.branch();
	  k1.campus();
	  k1.principal();
	  k1.newmethod_KECSP();
	  System.out.println("---------------------");
	  System.out.println("-----------shihgad college-------");

	
	Shihgad s1=new Shihgad();
      s1.branch();
      s1.campus();
      s1.principal();
      s1.newmethod_shihgad();
      System.out.println("---------------------");
      System.out.println("---------  SVERY college--------");


      SVERY s=new SVERY();
      s.branch();
      s.campus();
      s.principal();
}
}

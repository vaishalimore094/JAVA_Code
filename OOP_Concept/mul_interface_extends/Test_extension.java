package mul_interface_extends;

public class Test_extension implements Mother1{
 
	public static void main(String[] args) {
		Test_extension t=new Test_extension();
		t.keys(); 
		t.stories();
		t.reciep();
		t.looks();
		
		
		}

	@Override
	public void stories() {
		System.out.println("grandmothers stories");
		}
	

	@Override
	public void keys() {
		System.out.println("Grandmother keys");
		}

	@Override
	public void looks() {
	System.out.println("mothers look");
		}

	@Override
	public void reciep() {
    System.out.println("mothers receip");
		}

}

package multiple_interface;

public class Child implements Mother, Father{
	
	@Override
	public void look()
	{
		System.out.println("Mothers look");
	
	}
	@Override
	public void recipes()
	{
		System.out.println("mothers reciepes");	
	}

@Override
public void money() {
	System.out.println("fathers money");
	
}
@Override
public void bike() {
	System.out.println("Fathers bike");
	
}
@Override
public void cars() {
    Mother.super.cars();
	Father.super.cars();
}
public static void main(String[] args) {
	
	Child c=new Child();
	c.look();
	c.money();
	c.recipes();
	c.bike();
	c.cars();
}


}
package multiple_interface;

public interface Father {
    void money();
    void bike();
    default void cars()
    {
    	System.out.println("fathers car bmw");
    }
}

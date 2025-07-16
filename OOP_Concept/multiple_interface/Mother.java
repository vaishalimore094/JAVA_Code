package multiple_interface;

public interface Mother {
	
   void look();//incomplete method
   void recipes();//incomplete method
   default void cars()//complete default method
   {
	System.out.println("mothers car audi");   
   }
}

//note.........in onwords java 8 version we can define  a complete method in interface but 
//  In java this is a by default,default method
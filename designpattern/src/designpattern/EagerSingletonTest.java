package designpattern;


 class EagerSingleton{ 
	 
	 
    private static volatile EagerSingleton instance = new EagerSingleton();
 
    // private constructor
    private EagerSingleton() {
    }
 
    public static EagerSingleton getInstance() {
        return instance;
    }
    
    public void display()
    {
    	System.out.println("I am eagar Singleton");
    }
}


public class EagerSingletonTest {
	public static void main(String args[]){
	
	EagerSingleton testObject =EagerSingleton.getInstance();
	testObject.display();
	
	
	}
	
	
}

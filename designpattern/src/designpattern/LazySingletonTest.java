package designpattern;

 final class LazySingleton {
	
    private static volatile LazySingleton instance = null;
 
    // private constructor
    private LazySingleton() {
    }
 
    public static LazySingleton getInstanceSabari() {
    	
    	
        if (instance == null) {
        	
            synchronized (LazySingleton.class) {  //Synchronized block three level one leve sync method next class sync and block
            	
                instance = new LazySingleton();
                
            }
            
            
        }
        
        
        
        return instance;
    }
    public void display()
    {
    	System.out.println("I am Lazy Singleton");
    } 
    
}


public class LazySingletonTest {

	
	public static void main(String args[]){
		LazySingleton test= LazySingleton.getInstanceSabari();
		test.display();
		
	}
	
}

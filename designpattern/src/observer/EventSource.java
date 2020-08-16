package observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;

public class EventSource extends Observable implements Runnable {  
    @Override  
    public void run() {  
        try {  
           /* final InputStreamReader isr = new InputStreamReader(System.in);  
            final BufferedReader br = new BufferedReader(isr);  
            while (true) { */ 
        	System.out.println("Hello");
                String response = "Testing";  
                setChanged();  
                notifyObservers(response);  
           // }  
        }  
        catch (Exception e) {  
            e.printStackTrace();  
        }  
    } 
    
    
    public static void main(String args[]){
    	EventSource e=new EventSource();
    	Thread t=new Thread(e);
    	t.start();
    }
    
}

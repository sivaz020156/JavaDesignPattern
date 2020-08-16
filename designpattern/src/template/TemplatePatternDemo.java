package template;

public class TemplatePatternDemo {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {  
        
       // Class c=Class.forName(args[0]); 
        
        Chess c=new Chess();
        
        Game game=(Game) c;  
        game.play();     
      }  
}

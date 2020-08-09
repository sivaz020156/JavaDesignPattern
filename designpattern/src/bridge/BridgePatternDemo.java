package bridge;

public class BridgePatternDemo {  
    public static void main(String[] args) {  
    	
    QuestionFormat questions = new QuestionFormat("Java Programming Language");  
    
    questions.q = new JavaQuestions();  
    
    questions.delete("What is class? ");  
    questions.delete("What is interface? ");  
    questions.delete("What is abstraction? ");  
   // questions.display();
  
    //questions.newOne("What is inheritance? ");  
   // questions.newOne("How many types of inheritance are there in java?"); 
    questions.newOne("what is the use of learning java or advanced java?");  
    questions.displayAll();  
    
    
    
    }  
}// End of the BridgePatternDemo class.  
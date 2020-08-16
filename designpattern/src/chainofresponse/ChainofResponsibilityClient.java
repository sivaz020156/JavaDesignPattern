package chainofresponse;

public class ChainofResponsibilityClient { 
	
	
	
    private static Logger doChaining(){  
          Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO);  
            
          Logger errorLogger = new ErrorBasedLogger(Logger.ERRORINFO);  
          consoleLogger.setNextLevelLogger(errorLogger);  
            
          Logger debugLogger = new DebugBasedLogger(Logger.DEBUGINFO);  
          errorLogger.setNextLevelLogger(debugLogger);  
            
          return consoleLogger;   
          } 
    
    
    
    
          public static void main(String args[]){  
        	  
          Logger chainLogger= doChaining();  
  
              chainLogger.logMessage(Logger.OUTPUTINFO, "A ");  
              chainLogger.logMessage(Logger.ERRORINFO, "E");  
              chainLogger.logMessage(Logger.DEBUGINFO, "D");  
              }  
}
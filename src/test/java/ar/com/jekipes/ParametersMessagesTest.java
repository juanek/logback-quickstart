/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.jekipes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author juan kipes
 */
public class ParametersMessagesTest {
    private static final Logger logger = LoggerFactory.getLogger(ParametersMessagesTest.class.getSimpleName());
    
    public ParametersMessagesTest() {
    }
    


    

    


    
     @Test
     public void parameters1() {
         
         String nameApp = "myapp";
         String config = "deployment";
         
         logger.info("Start "+nameApp+" level "+config+".");
         
         logger.info("Start {} level {}.",nameApp,config);
         
         logger.error("one two three four fivr: {} {} {} {} {}", "1", "2", 
              "3","4", "5",new Exception("error"));

         
         
          assertTrue( true ); 
     }
}

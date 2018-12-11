/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.jekipes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
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
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
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

package ar.com.jekipes;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
/**
 * 
 * @author juan kipes
 */
public class AppTest {
  private static final Logger logger = LoggerFactory.getLogger(AppTest.class.getSimpleName());
  @Test
  public void evalTest() {
	logger.info("hello test!!!");
        assertTrue( true ); 
  }
}

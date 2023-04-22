package ar.com.juanek;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author juan kipes
 */
public class HierarchyLogs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

	Logger logger = LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
        logger.debug("Hello world root!!");        

	logger = LoggerFactory.getLogger("ar.com.jekipes");
        logger.info("Hello world!!!");
 
        logger = LoggerFactory.getLogger(HierarchyLogs.class.getPackage().getName());
        logger.debug("Hello world again!!");

	
    }

}

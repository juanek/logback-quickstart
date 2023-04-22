package ar.com.juanek;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author juan kipes
 */
public class Simple {

    private static final Logger logger = LoggerFactory.getLogger(Simple.class);

    private static final Logger loggerPackage = LoggerFactory.getLogger("ar.com.jekipes");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        logger.info("Hello world from {}", Simple.class.getSimpleName());
        logger.debug("Hello world from {}", Simple.class.getSimpleName());
        logger.warn("Hello world from {}", Simple.class.getSimpleName());
        logger.trace("Hello world from {}", Simple.class.getSimpleName());

        loggerPackage.info("Hello world from {}", Simple.class.getSimpleName());
    }

}

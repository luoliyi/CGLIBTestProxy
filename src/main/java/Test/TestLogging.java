package Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLogging {
    public static void main(String args[]) {
        Logger logger = LogManager.getLogger(TestLogging.class);
        logger.debug("Debug Level");
        logger.info("开始执行");
        logger.warn("Warn Level");
        logger.error("Error Level");
        logger.trace("Trace Level");
    }
}

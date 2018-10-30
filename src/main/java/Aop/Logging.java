package Aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {
    Logger logger;
    public Logging(){
        logger=LogManager.getLogger(Logging.class);
    }
    private String info;

    public void setInfo(String info) {
        logger.info(info);
    }

}

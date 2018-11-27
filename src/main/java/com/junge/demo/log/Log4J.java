package com.junge.demo.log;

import org.apache.log4j.Logger;

/**
 * @author liuxj
 * @date 2018-11-23 21:55
 */
public class Log4J {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("log4j");
        logger.debug("log4j");
    }
}

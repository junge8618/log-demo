package com.junge.demo.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liuxj
 * @date 2018-11-23 22:43
 */
public class SLF4J {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("SLF4j");
        logger.info("slf4j");
    }
}

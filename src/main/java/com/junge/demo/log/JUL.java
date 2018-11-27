package com.junge.demo.log;

import java.util.logging.Logger;

/**
 * @author liuxj
 * @date 2018-11-23 21:54
 */
public class JUL {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("JUL");
        logger.info("JUL");
    }
}

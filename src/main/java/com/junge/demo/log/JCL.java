package com.junge.demo.log;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author liuxj
 * @date 2018-11-23 22:08
 */
public class JCL {
    public static void main(String[] args) {
        Log log = LogFactory.getLog("JCL");
        log.info("JCL");
    }
}

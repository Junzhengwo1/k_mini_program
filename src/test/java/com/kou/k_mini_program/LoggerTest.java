package com.kou.k_mini_program;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author JIAJUN KOU
 */

@SpringBootTest(classes = KMiniProgramApplication.class)
public class LoggerTest {

    private final Logger logger= LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1(){
        String name ="王后";
        logger.debug("debug.....");
        logger.info("info......");
        logger.info("name:{}",name);
    }
}

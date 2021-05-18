package com.kou.k_mini_program;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//扫描我们的Mapper文件夹
@MapperScan("com.kou.k_mini_program.mapper")
public class KMiniProgramApplication {

    public static void main(String[] args) {
        SpringApplication.run(KMiniProgramApplication.class, args);
    }

}

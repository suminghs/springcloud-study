package com.example.fuzz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 *
 * </p>
 *
 * @author fuzz
 * @since 2020/10/19 13:38
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.example.fuzz.dao"})
public class CloudProvider7001 {

    public static void main(String[] args) {
        SpringApplication.run(CloudProvider7001.class, args);
    }
}

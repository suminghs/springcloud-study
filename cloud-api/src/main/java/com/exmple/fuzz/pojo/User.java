package com.exmple.fuzz.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * </p>
 *
 * @author fuzz
 * @since 2020/10/19 11:50
 */
@Component
@Data
public class User {
    private Integer id;
    private String name;
}

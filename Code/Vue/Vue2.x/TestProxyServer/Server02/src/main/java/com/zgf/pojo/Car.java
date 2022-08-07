package com.zgf.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Car {
    private Integer id;
    private String name;
    private Integer age;

}

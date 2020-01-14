package com.dkq.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Car implements Serializable {

    private Integer id;
    private String name;
    private String type;
    private Integer sitnum;
    private Integer cid;
    private Double price;
    private Integer number;
    private String picture;

}

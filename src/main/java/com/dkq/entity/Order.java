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
public class Order implements Serializable {

    private String id;
    private Integer cid;
    private Integer uid;
    private Integer getid;
    private Integer backid;
    private Double oprice;
    private String ostatus;
    private Car car;
    private City getcity;
    private City backcity;
}

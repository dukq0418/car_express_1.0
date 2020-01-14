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
public class User implements Serializable {

    private Integer id;
    private String tel;
    private String password;
    private String email;
    private String invitation;
}

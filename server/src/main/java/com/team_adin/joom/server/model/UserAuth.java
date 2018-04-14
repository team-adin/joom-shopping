package com.team_adin.joom.server.model;

import lombok.Data;
import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Data
public class UserAuth {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String login;
    private String pwd;
}

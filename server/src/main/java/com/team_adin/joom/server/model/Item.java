package com.team_adin.joom.server.model;

import lombok.Data;
import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

@Entity
@Data
public class Item {

    @Id
    private String id;
    private String reference;

}

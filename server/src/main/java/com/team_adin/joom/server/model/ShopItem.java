package com.team_adin.joom.server.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "items")
@Data
public class ShopItem {

    @Id
    private String id;
    private String name;
}

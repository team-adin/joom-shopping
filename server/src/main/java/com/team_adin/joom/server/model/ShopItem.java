package com.team_adin.joom.server.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "items")
@Data
public class ShopItem {

    @Id
    private String itemId;
    private String itemName;
    private String price;
    private String size;
    private String color;
    private String discount100;
}

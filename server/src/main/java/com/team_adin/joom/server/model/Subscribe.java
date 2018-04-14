package com.team_adin.joom.server.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "subscribes")
@Data
public class Subscribe {
    @Id
    private String id;
    private String shopItemId;
    private String userInfoId;
    private String count;
    private String date;
}

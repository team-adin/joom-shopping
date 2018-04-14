package com.team_adin.joom.server.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Data
public class UserInfo {

    @Id
    private String userId;
    private String userName;
}

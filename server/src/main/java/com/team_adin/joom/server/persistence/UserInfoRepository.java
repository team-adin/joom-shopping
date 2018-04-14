package com.team_adin.joom.server.persistence;

import com.team_adin.joom.server.model.UserInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserInfoRepository extends MongoRepository<UserInfo, String> {
}

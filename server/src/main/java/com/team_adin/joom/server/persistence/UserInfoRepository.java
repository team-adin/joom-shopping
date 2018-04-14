package com.team_adin.joom.server.persistence;

import com.team_adin.joom.server.model.UserInfo;
import org.springframework.data.repository.CrudRepository;

public interface UserInfoRepository extends CrudRepository<UserInfo, String> {
}

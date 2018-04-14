package com.team_adin.joom.server.persistence;

import com.team_adin.joom.server.model.UserAuth;
import org.springframework.data.repository.CrudRepository;

public interface UserAuthRepository extends CrudRepository<UserAuth, String> {
}

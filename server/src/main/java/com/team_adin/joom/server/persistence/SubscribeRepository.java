package com.team_adin.joom.server.persistence;

import com.team_adin.joom.server.model.Subscribe;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SubscribeRepository extends MongoRepository<Subscribe, String> {
    List<Subscribe> findAllByUserInfoId(String userInfoId);
    Integer countByShopItemId(String shopItemId);
    Long removeByUserInfoIdAndShopItemId(String userInfoId, String shopItemId);
}

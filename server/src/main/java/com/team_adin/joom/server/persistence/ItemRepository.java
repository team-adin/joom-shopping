package com.team_adin.joom.server.persistence;

import com.team_adin.joom.server.model.ShopItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends MongoRepository<ShopItem, String> {

}

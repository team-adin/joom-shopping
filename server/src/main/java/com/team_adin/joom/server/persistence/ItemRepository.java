package com.team_adin.joom.server.persistence;

import com.team_adin.joom.server.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, String> {

}

package com.team_adin.joom.server.service.itemservice;

import com.team_adin.joom.server.model.Item;

import java.util.List;

public interface ItemService {

    Item addItem(Item item);

    Iterable<Item> getItems();
}

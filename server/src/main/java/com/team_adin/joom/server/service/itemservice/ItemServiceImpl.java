package com.team_adin.joom.server.service.itemservice;

import com.team_adin.joom.server.model.Item;
import com.team_adin.joom.server.persistence.ItemRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    private ItemRepository itemRepository;

    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item addItem(Item item) {
        return this.itemRepository.save(item);
    }
}

package com.team_adin.joom.server.controller;

import com.team_adin.joom.server.persistence.ItemRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/items")
public class ItemController {

    private ItemRepository itemRepository;

    ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping()
    public @ResponseBody String getItems() {
        return this.itemRepository.findAll().toString();
    }
}

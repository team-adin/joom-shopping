package com.team_adin.joom.server.controller;

import com.team_adin.joom.server.model.ShopItem;
import com.team_adin.joom.server.persistence.ItemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/items")
public class ItemController {

    private ItemRepository itemRepository;

    ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping(value = "/all")
    @ResponseBody
    public List<ShopItem> getItems() {
        return this.itemRepository.findAll();
    }

    @GetMapping(value = "/discounts")
    @ResponseBody
    public List<ShopItem> getItemsDiscount() {
        return this.itemRepository.findAllByDiscount100();
    }
}

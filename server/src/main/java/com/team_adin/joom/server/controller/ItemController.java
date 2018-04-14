package com.team_adin.joom.server.controller;

import com.team_adin.joom.server.model.Item;
import com.team_adin.joom.server.service.itemservice.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/items")
public class ItemController {

    private ItemService itemService;

    ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping()
    public String add(@RequestBody Item item) {
        Item litem = itemService.addItem(item);

        return (litem != null) ? "Saved" : "Error";
    }
}

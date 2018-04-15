package com.team_adin.joom.server.controller;

import com.team_adin.joom.server.model.ShopItem;
import com.team_adin.joom.server.persistence.ItemRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> getItems() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Access-Control-Allow-Origin","*");
        return new ResponseEntity<>(this.itemRepository.findAll(), headers, HttpStatus.OK);
    }

    @GetMapping(value = "/discounts")
    @ResponseBody
    public List<ShopItem> getItemsDiscount() {
        return this.itemRepository.findAllByDiscount100("true");
    }

    @GetMapping("/{item_id}")
    @ResponseBody
    public ResponseEntity<?> getItemByID(@PathVariable String item_id) {
        ShopItem item = this.itemRepository.findByItemId(item_id);
        return (item != null) ? new ResponseEntity<>(item, HttpStatus.OK) : new ResponseEntity<>("Such Item not exists", HttpStatus.NOT_FOUND);
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<?> load(@RequestBody ShopItem shopItem) {
        ShopItem item = this.itemRepository.save(shopItem);

        return (item != null) ? new ResponseEntity<>(item, HttpStatus.CREATED) : new ResponseEntity<>("ErrorPostItem", HttpStatus.NO_CONTENT);
    }
}

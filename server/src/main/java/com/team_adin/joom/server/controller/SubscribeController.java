package com.team_adin.joom.server.controller;

import com.team_adin.joom.server.model.Subscribe;
import com.team_adin.joom.server.persistence.SubscribeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "api/subscribes")
public class SubscribeController {

    private SubscribeRepository subscribeRepository;

    SubscribeController(SubscribeRepository subscribeRepository) {
        this.subscribeRepository = subscribeRepository;
    }

    @GetMapping(value = "/get/{userInfoId}")
    @ResponseBody
    public HashMap<Subscribe, Integer> getSubscribes(@PathVariable String userInfoId) {
        //return this.subscribeRepository.findAllByUserInfoId(userInfoId);
        List<Subscribe> subscribes = this.subscribeRepository.findAllByUserInfoId(userInfoId);
        HashMap<Subscribe, Integer> map = new HashMap<>();
        for (Subscribe subscribe : subscribes) {
            map.put(subscribe, this.subscribeRepository.countByShopItemId(subscribe.getShopItemId()));
        }
        return map;
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<?> load(@RequestBody Subscribe subscribe) {
        return (subscribe != null)
                ? new ResponseEntity<>(this.subscribeRepository.save(subscribe), HttpStatus.CREATED)
                : new ResponseEntity<>("ErrorPostSubscribe", HttpStatus.NO_CONTENT);
    }

    @DeleteMapping
    @ResponseBody
    public ResponseEntity<?> unsubscribe(@RequestParam("userInfoId") String userInfoId,
                                         @RequestParam("shopItemId") String shopItemId) {
        return new ResponseEntity<>(
                this.subscribeRepository.removeByUserInfoIdAndShopItemId(userInfoId, shopItemId),
                HttpStatus.OK
        );
    }
}

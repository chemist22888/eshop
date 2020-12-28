package com.asavin.eshop.controller;

import com.asavin.eshop.Entity.Watch;
import com.asavin.eshop.service.WatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    WatchService watchService;
    @PostMapping("/order")
    public ResponseEntity order(@RequestBody Watch watch) {
        HttpStatus status = HttpStatus.CREATED;
        if(watchService.isValid(watch))
            watchService.save(watch);
        else
            status = HttpStatus.UNPROCESSABLE_ENTITY;
        return new ResponseEntity(status);
    }
}

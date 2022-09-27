package com.provapw.server.controller;

import com.provapw.server.model.Item;
import com.provapw.server.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @PostMapping("save")
    public ResponseEntity<?> save(@RequestBody Item item) throws Exception {

        itemService.save(item);
        return ResponseEntity.ok().body(item);
    }

    @GetMapping("getAll")
    public ResponseEntity<?> getAll() throws Exception {

        Object obj = itemService.getAll();
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping("getByID/{id}")
    public ResponseEntity<?> getByID(@PathVariable(value = "id") int id) throws Exception {

        Object obj = itemService.getByID(Item.class,id);
        return ResponseEntity.ok().body(obj);
    }
}

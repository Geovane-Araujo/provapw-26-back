package com.provapw.server.controller;

import com.provapw.server.dto.LoginData;
import com.provapw.server.model.Item;
import com.provapw.server.service.ItensService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("itens")
public class ItensController {

    @Autowired
    ItensService itensService;

    @PostMapping("save")
    public ResponseEntity<?> save(@RequestBody Item item) throws Exception {

        itensService.save(item);
        return ResponseEntity.ok().body(item);
    }

    @GetMapping("getAll")
    public ResponseEntity<?> getAll() throws Exception {

        Object obj = itensService.getAll();
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping("getByID/{id}")
    public ResponseEntity<?> getByID(@PathVariable(value = "id") int id) throws Exception {

        Object obj = itensService.getByID(Item.class,id);
        return ResponseEntity.ok().body(obj);
    }
}

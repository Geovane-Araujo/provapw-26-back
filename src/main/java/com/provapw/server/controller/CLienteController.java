package com.provapw.server.controller;

import com.provapw.server.model.Item;
import com.provapw.server.service.ClienteService;
import com.provapw.server.service.LocacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("cliente")
public class CLienteController {

    @Autowired
    ClienteService cliente;

//    @PostMapping("save")
//    public ResponseEntity<?> save(@RequestBody Item item) throws Exception {
//
//        locacaoService.save(item);
//        return ResponseEntity.ok().body(item);
//    }

    @GetMapping("getAll")
    public ResponseEntity<?> getAll() throws Exception {

        Object obj = cliente.getAll();
        return ResponseEntity.ok().body(obj);
    }

//    @GetMapping("getByID/{id}")
//    public ResponseEntity<?> getByID(@PathVariable(value = "id") int id) throws Exception {
//
//        Object obj = locacaoService.getByID(Item.class,id);
//        return ResponseEntity.ok().body(obj);
//    }
}

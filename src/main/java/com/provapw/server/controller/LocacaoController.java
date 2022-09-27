package com.provapw.server.controller;

import com.provapw.server.model.Locacao;
import com.provapw.server.service.LocacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("locacao")
public class LocacaoController {

    @Autowired
    LocacaoService locacaoService;

    @PostMapping("save")
    public ResponseEntity<?> save(@RequestBody Locacao locacao) throws Exception {

        locacaoService.save(locacao);
        return ResponseEntity.ok().body(locacao);
    }

    @GetMapping("getAll")
    public ResponseEntity<?> getAll() throws Exception {

        Object obj = locacaoService.getAll();
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping("getByID/{id}")
    public ResponseEntity<?> getByID(@PathVariable(value = "id") int id) throws Exception {

        Object obj = locacaoService.getById(id);// AQUI BUGOU
        return ResponseEntity.ok().body(obj);
    }
}

package com.provapw.server.security.login;

import com.provapw.server.dto.LoginData;
import com.provapw.server.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("authentication")
@CrossOrigin("*")
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("login")
    public ResponseEntity<?> login(@RequestBody LoginData loginData){

        String tk = loginService.verifyLogin(loginData);
        return ResponseEntity.ok().body(tk);
    }
}

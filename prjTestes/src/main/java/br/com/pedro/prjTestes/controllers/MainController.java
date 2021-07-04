package br.com.pedro.prjTestes.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MainController {

    @GetMapping(path = "/")
    public ResponseEntity getUsuario(){
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping(path = "/")
    public ResponseEntity inserirUsuario(){
        return new ResponseEntity(null, HttpStatus.OK);
    }



}

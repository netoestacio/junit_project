package br.com.pesn.estudo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping(path = "/api")
public class MainController {

    @GetMapping(path = "/user/{id}")
    public ResponseEntity getUser(@PathVariable("id") Long id){
        if(id > 0){
            return new ResponseEntity("OK esta retornando", HttpStatus.OK);
        }else{
            return new ResponseEntity(null, HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping(path = "/users")
    public ResponseEntity getAllUsers(){
        return new ResponseEntity("OK esta retornando", HttpStatus.OK);
    }
}

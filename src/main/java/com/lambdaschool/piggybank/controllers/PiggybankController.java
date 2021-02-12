package com.lambdaschool.piggybank.controllers;


import com.lambdaschool.piggybank.models.Piggybank;
import com.lambdaschool.piggybank.repositories.PiggybankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PiggybankController
{
    @Autowired
    PiggybankRepository piggyrepo;


//    http://localhost:2021/total
    // Logic needed
        //

    @GetMapping(value = "/total", produces = {"application/json"})
    public ResponseEntity<?> listAllCoins()
    {
        List<Piggybank> myList = new ArrayList<>();
        piggyrepo.findAll().iterator().forEachRemaining(myList::add);
        return new ResponseEntity<>(myList, HttpStatus.OK);
    }
}

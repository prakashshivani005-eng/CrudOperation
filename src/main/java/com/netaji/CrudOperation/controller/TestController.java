package com.netaji.CrudOperation.controller;

import com.netaji.CrudOperation.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")

public class TestController {

    @Autowired
    TestService  testService;

    @GetMapping("/hellos")
    public ResponseEntity<String> getHelloMethod(){
       // String str = "shivani";
       // testService.printName();
        String st = testService.printName();
        return new ResponseEntity<>(st, HttpStatusCode.valueOf(200));
    }

};

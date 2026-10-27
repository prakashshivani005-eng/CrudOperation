package com.netaji.CrudOperation.contollers;


import com.netaji.CrudOperation.mapper.UserRequest;
import com.netaji.CrudOperation.mapper.UserResponse;
import com.netaji.CrudOperation.service.UserOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Crud")
public class CrudOperationContoller {

    @Autowired
    UserOperationService userOperationService;

    // http://localhost:8088/Crud/post
    @PostMapping("/post")
    public ResponseEntity<UserResponse> postUser(@RequestBody UserRequest userReq){

        UserResponse userResponse = userOperationService.postUser(userReq);
        System.out.println(userResponse);
        return new ResponseEntity<>(userResponse, HttpStatusCode.valueOf(200));
        // return new ResponseEntity<>(userResponse, HttpStatus.OK);

    }

}
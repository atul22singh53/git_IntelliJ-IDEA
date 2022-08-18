package com.example.json_check;

import org.json.simple.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {



    @GetMapping("/check/{id}")
    public ResponseEntity <JSONObject> call(@PathVariable int id)
    {
        JSONObject parent = new JSONObject();


        JSONObject obj = new JSONObject();
        obj.put("push ","j");
        parent.put("error",obj);


        System.out.println(" this "+parent);

        //return new ResponseEntity<>(parent,HttpStatus.OK);

        return ResponseEntity.status(HttpStatus.OK).body(parent);
    }


}

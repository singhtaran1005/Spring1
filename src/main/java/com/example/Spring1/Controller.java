package com.example.Spring1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
     @GetMapping("/hi")
    public String sayHi(){
         return "hello from our server";
     }

     @GetMapping("/search")
    public String searchWord(@RequestParam String q)
     {
         DataStore db = new DataStore();
         return db.getDataFromDb(q);
         return "Sachin is A Great batsman";
     }

}

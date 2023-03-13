package First.API1.First.API1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//esercizio 1
@RestController
public class NameController {

    @GetMapping(value = "/name")
    public String getName(@RequestParam String name){
        return name;
    }



    @PostMapping(value = "/name")
    public StringBuilder postName(@RequestParam String name){
        StringBuilder sb = new StringBuilder(name);
        return sb.reverse();
    }
}

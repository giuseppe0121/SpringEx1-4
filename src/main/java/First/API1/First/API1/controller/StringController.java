package First.API1.First.API1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.security.PublicKey;
//esercizio 3
@RestController
public class StringController {


    @GetMapping(value = "/string")
    public String getString(@RequestParam() String n1,@RequestParam(required = false) String n2){

        if (n2== null){
            return "n1 is " + n1 ;
        }

        return "n1 is "+n1 + " n2 is "+ n2;
    }
}

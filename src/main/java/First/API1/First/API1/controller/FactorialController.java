package First.API1.First.API1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factorial")
public class FactorialController {

    @GetMapping("/")
    public int factorial(@RequestParam Integer n){

        int x = 1;
        
        for (int i = 1; i <= n; i++) {
            if(n == 0){

                return 0;

            }else {
                x = x * i;
            }
        }
        return x;
    }

}

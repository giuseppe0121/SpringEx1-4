package First.API1.First.API1.controller;



import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;


import java.net.InetSocketAddress;


@RestController
public class HeaderController {

    @GetMapping(value = "/header")
    public String getHeareds(@RequestHeader HttpHeaders headers){
        InetSocketAddress host = headers.getHost();
        return "l'host è "+ host.getHostName() + " la porta è "+ host.getPort();
    }


    @GetMapping("/greeting")
    public ResponseEntity<String> greeting(@RequestHeader(HttpHeaders.ACCEPT_LANGUAGE) String language) {
        // code that uses the language variable
        return new ResponseEntity<String>(language, HttpStatus.OK);
    }





}

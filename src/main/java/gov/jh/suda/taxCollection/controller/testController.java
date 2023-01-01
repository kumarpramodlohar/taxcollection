package gov.jh.suda.taxCollection.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class testController {

    @GetMapping
    public String test(Principal principal) {
        return "Hello "+principal.getName();
    }

}

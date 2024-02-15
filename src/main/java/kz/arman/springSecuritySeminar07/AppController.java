package kz.arman.springSecuritySeminar07;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/login")
    public String loginEndPoint() {
        return "login";
    }

    @GetMapping("/public-data")
    public String userEndPoint() {
        return "public";
    }

    @GetMapping("/private-data")
    public String adminEndPoint() {
        return "private";
    }
}

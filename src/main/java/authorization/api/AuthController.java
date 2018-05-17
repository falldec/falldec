package authorization.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @RequestMapping("/")
    public String authIndex() {
        return "Greetings from AuthController.";
    }


}
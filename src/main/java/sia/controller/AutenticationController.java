package sia.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/authentication")
public class AutenticationController {

    @GetMapping("/success")
    public Boolean login(){
        return true;
    }

    @GetMapping("/err")
    public Boolean loginerr(){
        return false;
    }
}

package com.banaoatg.task1.signup;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
//@RequestMapping(path = "api/v1/sign-up")
@AllArgsConstructor
public class SignUpController {

    @RequestMapping("/")
    public String displayLogin(){
        return "sign-up.html";
    }
//    private final SignUpService signUpService;
//
//    @PostMapping
//    public String register(@RequestBody SignUpRequest request){
//        return signUpService.register(request);
//    }
//
//    @GetMapping(path = "confirm")
//    public String confirm(@RequestParam("token") String token) {
//        return signUpService.confirmToken(token);
//    }
}


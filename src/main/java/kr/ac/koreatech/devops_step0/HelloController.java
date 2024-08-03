package kr.ac.koreatech.devops_step0;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "index.html";
    }
    
}

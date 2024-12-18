package com.muzik.todo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 시작페이지(메인페이지)를 작업할 컨트롤러
@Controller
public class IndexController {

    // {"/","/index"} 여러 url을 동시에 쓰려면 중괄호에 담아야함
    @GetMapping({"/","/index"})
    public String index() {
        return "redirect:/a";
    }

}

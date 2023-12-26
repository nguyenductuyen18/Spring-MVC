package com.example.demo15;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    @GetMapping("/caculatorPlay")
    public String index() {
        return "caculator";
    }
    @RequestMapping("/caculator")
    public String caculator(@RequestParam("number1") int number1, @RequestParam("number2") int number2,@RequestParam("calculation") String calculation, Model model) {
switch (calculation){
    case "+":
        model.addAttribute("result",number1+number2);
        break;
    case "-":
        model.addAttribute("result",number1-number2);
        break;
    case "*":
        model.addAttribute("result",number1*number2);
        break;
    case "/":
        model.addAttribute("result",number1/number2);
        break;
}

        return "caculator";
    }
}

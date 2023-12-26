package com.example.demo15;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Method;
import java.util.List;

@Controller
public class SandwichController {
    @GetMapping("/")
    public String index() {
        return "btIndex1";
    }
    @RequestMapping("/save")
    public String save(@RequestParam("condiment") List<String> condiment, ModelMap modelMap) {
        modelMap.addAttribute("condiment",condiment);
        return "btSandwich";
    }

}

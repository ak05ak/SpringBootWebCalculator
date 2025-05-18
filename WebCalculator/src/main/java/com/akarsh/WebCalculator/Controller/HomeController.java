package com.akarsh.WebCalculator.Controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(HttpSession session) {
        // Clear any previous session attributes when returning to home page
        session.removeAttribute("error");
        session.removeAttribute("res");
        session.removeAttribute("operation");
        session.removeAttribute("num1");
        session.removeAttribute("num2");
        return "index.jsp";
    }
}

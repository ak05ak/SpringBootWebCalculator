package com.akarsh.WebCalculator.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalculateController {
    @RequestMapping("calculate")
    public String calculate(HttpServletRequest req, HttpSession session) {
        try {
            double num1 = Double.parseDouble(req.getParameter("num1"));
            double num2 = Double.parseDouble(req.getParameter("num2"));
            String operation = req.getParameter("operation");
            double result = 0;
            String errorMessage = null;
            String oper=null;

            switch(operation) {
                case "add":
                    result = num1 + num2;
                    oper="+";
                    break;
                case "subtract":
                    result = num1 - num2;
                    oper="-";
                    break;
                case "multiply":
                    result = num1 * num2;
                    oper="*";
                    break;
                case "divide":
                    if (num2 == 0) {
                        errorMessage = "Cannot divide by zero";
                    } else {
                        result = num1 / num2;
                        oper="/";
                    }
                    break;
            }

            if (errorMessage != null) {
                session.setAttribute("error", errorMessage);
            } else {
                session.setAttribute("res", result);
                session.setAttribute("operation", oper);
                session.setAttribute("num1", num1);
                session.setAttribute("num2", num2);
            }

        } catch (NumberFormatException e) {
            session.setAttribute("error", "Please enter valid numbers");
        }

        return "result.jsp";
    }
}

package jfsdexam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ClientController {

    @RequestMapping("/welcome")
    public String showWelcomeMessage() {
        return "test"; // Renders test.jsp
    }

    @RequestMapping("/test")
    public String renderTestPage() {
        return "test"; // Renders test.jsp
    }

    @RequestMapping("/showInfo")
    public String showInfo(@RequestParam("id") int id, @RequestParam("name") String name, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "showInfo";
    }

    @RequestMapping("/calculateSum/{num1}/{num2}")
    public String calculateSum(@PathVariable int num1, @PathVariable int num2, Model model) {
        int sum = num1 + num2;
        model.addAttribute("result", "Sum: " + sum);
        return "result";
    }

    @RequestMapping("/employeeForm")
    public String showEmployeeForm() {
        return "employeeForm";
    }

    @RequestMapping("/addNumbers")
    public String addNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        model.addAttribute("result", num1 + num2);
        return "additionResult";
    }

    @RequestMapping("/combine")
    public String combineStrings(@RequestParam("str1") String str1, @RequestParam("str2") String str2, Model model) {
        model.addAttribute("result", str1 + " " + str2);
        return "combinedResult";
    }

    @RequestMapping("/calculate")
    public String calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int sum = num1 + num2;
        int product = num1 * num2;
        model.addAttribute("sum", sum);
        model.addAttribute("product", product);
        return "calculationResults";
    }
}


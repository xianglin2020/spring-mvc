package controller;

import domain.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Demo class
 *
 * @author jack
 * @date 18-7-7
 */
@Controller
public class EmployeeController {

    @RequestMapping("/add-employee")
    public String inputEmployee(Model model){
        model.addAttribute(new Employee());
        return "EmployeeForm";
    }

    @RequestMapping("/save-employee")
    public String saveEmployee(@ModelAttribute Employee employee, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            FieldError fieldError = bindingResult.getFieldError();
            return "EmployeeForm";
        }

        model.addAttribute("employee", employee);
        return "EmployeeDetails";
    }
}

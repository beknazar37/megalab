package kg.megacom.springbootdemo.controller;

import kg.megacom.springbootdemo.models.Employee;
import kg.megacom.springbootdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public String findAll(Model model){
        List<Employee> employees=employeeService.findAll();
        model.addAttribute("employees",employees);
        return "user-list";
    }
    @GetMapping("/employee-create")
    public String createEmployeeForm(Employee employee){
        return "employee-create";
    }
    @PostMapping("/employee-create")
    public String createEmployee(Employee employee){
        employeeService.saveEmployees(employee);
        return "redirect:/employees";
    }
    @GetMapping("/employee-delete/{id}")
    public String deleteEmployee(@PathVariable("id")Long id){
        employeeService.deleteById(id);
        return "redirect:/users";
    }
    @GetMapping("/employee-update/{id}")
    public String updateEmployeeForm(@PathVariable("id")Long id, Model model){
        Employee employee=employeeService.findById(id);
        model.addAttribute("employees",employee );
        return "/employee-update";
    }
    @PostMapping("/employee-update")
    public String updateEmployee(Employee employee){
        employeeService.saveEmployees(employee);
        return "redirect:/users";
    }
}

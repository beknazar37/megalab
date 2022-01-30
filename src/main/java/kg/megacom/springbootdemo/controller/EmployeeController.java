package kg.megacom.springbootdemo.controller;

import kg.megacom.springbootdemo.models.dto.EmployeeDto;
import kg.megacom.springbootdemo.models.entity.Employee;
import kg.megacom.springbootdemo.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeService;

    public EmployeeController(EmployeeServiceImpl employeeService) {
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
    public Employee createEmployee(EmployeeDto employeeDto){
        return  employeeService.saveEmployees(employeeDto);
    }
    @GetMapping("/employee-delete/{id}")
    public String deleteEmployee(@PathVariable("id")Long id){
       return  employeeService.deleteById(id);
    }
    @PostMapping("/employee-update")
    public Employee updateEmployee(Employee employee){
        return  employeeService.updateEmployee(employee.getId());

    }
}

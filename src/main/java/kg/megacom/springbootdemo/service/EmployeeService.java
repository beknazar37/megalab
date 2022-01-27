package kg.megacom.springbootdemo.service;

import kg.megacom.springbootdemo.models.Employee;
import kg.megacom.springbootdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeesRepository;

    public EmployeeService(EmployeeRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }

    public Employee findById(Long id) {
        return employeesRepository.getOne(id);
    }
    public List<Employee>findAll(){
        return employeesRepository.findAll();
    }
    public Employee saveEmployees(Employee employees){
        return employeesRepository.save(employees);
    }
    public void deleteById(Long id){
        employeesRepository.deleteById(id);

    }

}

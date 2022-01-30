package kg.megacom.springbootdemo.service.impl;

import kg.megacom.springbootdemo.models.dto.EmployeeDto;
import kg.megacom.springbootdemo.models.entity.Employee;
import kg.megacom.springbootdemo.dao.EmployeeRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl {
    @Autowired
    private EmployeeRep employeesRepository;

    public EmployeeServiceImpl(EmployeeRep employeesRepository) {
        this.employeesRepository = employeesRepository;
    }

    public Employee findById(Long id) {
        return employeesRepository.getOne(id);
    }
    public List<Employee>findAll(){
        return employeesRepository.findAll();
    }
    public Employee saveEmployees(EmployeeDto employees){
        return employeesRepository.save(employees);
    }
    public String deleteById(Long id){

        employeesRepository.deleteById(id);

        return null;
    }
    public Employee updateEmployee(Long id) {
        return null;
    }

}

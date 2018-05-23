package com.nantian.boot.service;

import com.nantian.boot.entities.Department;
import com.nantian.boot.entities.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeService {
    private static  Map<Integer,Employee> map;

    static{
        map = new HashMap<Integer,Employee>();
        for(int i=0;i<10;i++){
            Employee e = new Employee();
            e.setId(i);
            e.setLastName("张三"+i);
            e.setBirth(new Date());
            e.setDepartment( new Department().setDepartmentName("D"+i).setId(i));
            e.setEmail("qbcd"+i+"@163.com");
            e.setGender(i%2);
            map.put(i,e);
        }
    }

    public Collection<Employee> getAllEmp(){
        return map.values();
    }
    public Employee getById(Integer id){
        return map.get(id);
    }
    public Map<Integer,Employee> save(Employee emp){
    	map.put(map.size(),emp);
        return map;
    }
    public Map<Integer,Employee> delete(Integer id){
	map.remove(id);
        return map;
    }


}

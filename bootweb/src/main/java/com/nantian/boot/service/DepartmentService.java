package com.nantian.boot.service;

import com.nantian.boot.entities.Department;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {

    public static List<Department> list;

    static{
        list = new ArrayList<Department>();
        for(int i=0;i<10;i++){
            Department dep = new Department();
            dep.setId(i);
            dep.setDepartmentName("D"+i);
            list.add(dep);
        }
    }
    public List<Department> getDepartments(){
        return list;
    }
}

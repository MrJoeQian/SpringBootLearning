package com.nantian.boot.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.nantian.boot.entities.Department;
import com.nantian.boot.entities.Employee;
import com.nantian.boot.service.DepartmentService;
import com.nantian.boot.service.EmployeeService;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeServic;
    @Autowired
    private DepartmentService departmentService;

    /**
     * 查询员工列表
     * @param model
     * @return
     */
    @GetMapping("emps")
    public String listEmp(Model model){
        Collection<Employee> emps =  employeeServic.getAllEmp();
        model.addAttribute("emps",emps);
        return "emp/list";
    }

    /**
     * 到添加页面
     * @param model
     * @return
     */
    @GetMapping("emp")
    public String toAddPage(Model model){
        List<Department> list =  departmentService.getDepartments();
        model.addAttribute("depts",list);
        return "emp/add";
    }
    //来到修改页面，查出当前员工，在页面回显
    @GetMapping("emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id,Model model){
        Employee employee = employeeServic.getById(id);
        model.addAttribute("emp",employee);

        //页面要显示所有的部门列表
        Collection<Department> departments = departmentService.getDepartments();
        model.addAttribute("depts",departments);
        //回到修改页面(add是一个修改添加二合一的页面);
        return "emp/add";
    }


    //员工添加
    //SpringMVC自动将请求参数和入参对象的属性进行一一绑定；要求请求参数的名字和javaBean入参的对象里面的属性名是一样的
    @PostMapping("emp")
    public String addEmp(Employee employee){
        //来到员工列表页面

        System.out.println("保存的员工信息："+employee);
        //保存员工
        employeeServic.save(employee);
        // redirect: 表示重定向到一个地址  /代表当前项目路径
        // forward: 表示转发到一个地址
        return "redirect:/emps";
    }
    //员工修改；需要提交员工id；
    @PutMapping("emp")
    public String updateEmployee(Employee employee){
        System.out.println("修改的员工数据："+employee);
        employeeServic.save(employee);
        return "redirect:/emps";
    }
    //员工删除
    @DeleteMapping("emp/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id){
        employeeServic.delete(id);
        return "redirect:/emps";
    }

}

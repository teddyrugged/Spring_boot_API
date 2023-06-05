package com.josiah.Spring_boot_api.controller;

import com.josiah.Spring_boot_api.entity.Department;
import com.josiah.Spring_boot_api.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department) {
          return departmentService.saveDepartment  (department);
    }
}

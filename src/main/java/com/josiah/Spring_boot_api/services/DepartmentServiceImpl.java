package com.josiah.Spring_boot_api.services;

import com.josiah.Spring_boot_api.entity.Department;
import com.josiah.Spring_boot_api.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
}

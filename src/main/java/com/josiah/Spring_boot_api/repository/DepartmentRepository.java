package com.josiah.Spring_boot_api.repository;

import com.josiah.Spring_boot_api.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

}

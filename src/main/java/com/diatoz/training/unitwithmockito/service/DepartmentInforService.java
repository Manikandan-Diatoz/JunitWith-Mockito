package com.diatoz.training.unitwithmockito.service;

import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diatoz.training.unitwithmockito.domain.Department;
import com.diatoz.training.unitwithmockito.domain.DepartmentDto;
import com.diatoz.training.unitwithmockito.repostiory.DepartmentInfoRepo;

@Service
public class DepartmentInforService implements DepartmentInfo {

	@Autowired
	private DepartmentInfoRepo departmentInfoRepo;
	@Override
	public Department addnewDepartment(DepartmentDto departmentdto) {
		Department department = new Department();
		department.setDepartmentName(departmentdto.getDepartmentName());
		return departmentInfoRepo.save(department);
	}
	@Override
	public Set<Department> getAllDepartments() {
		return new HashSet<>(departmentInfoRepo.findAll());
	}

}

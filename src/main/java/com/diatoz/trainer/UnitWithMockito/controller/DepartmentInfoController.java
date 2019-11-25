package com.diatoz.trainer.UnitWithMockito.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.diatoz.trainer.UnitWithMockito.domain.Department;
import com.diatoz.trainer.UnitWithMockito.domain.DepartmentDto;
import com.diatoz.trainer.UnitWithMockito.repostiory.DepartmentInfoRepo;
import com.diatoz.trainer.UnitWithMockito.service.DepartmentInfo;

@RestController
@RequestMapping("/departmentInfo")
public class DepartmentInfoController {

	@Autowired
	private DepartmentInfo departmentInfo;

	@PostMapping("/addDepartmentInfo")
	public ResponseEntity<Department> addnewDepartment(@RequestBody DepartmentDto departmentdto) {
		return new ResponseEntity<>(departmentInfo.addnewDepartment(departmentdto),HttpStatus.ACCEPTED);
		
		}
	@GetMapping("/getAllDepartmentInfo")
	public ResponseEntity<Set<Department>> getAllUs() {
		return new ResponseEntity<Set<Department>>((Set<Department>) departmentInfo.getAllDepartments(),HttpStatus.ACCEPTED);
	}
	
}

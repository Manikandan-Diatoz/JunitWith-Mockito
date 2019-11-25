package com.diatoz.trainer.UnitWithMockito.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diatoz.trainer.UnitWithMockito.domain.StudentDetails;
import com.diatoz.trainer.UnitWithMockito.domain.StudentDetailsDto;
import com.diatoz.trainer.UnitWithMockito.service.StudentInterface;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentInterface studentInterface;

	@PostMapping("/addStudent")
	public ResponseEntity<StudentDetails> addnewStudent(@RequestBody StudentDetailsDto studentDetailsDto) {
		return new ResponseEntity<>(studentInterface.addnewStudent(studentDetailsDto), HttpStatus.ACCEPTED);
	}

	@GetMapping("/getAllStudent")
	public ResponseEntity<Set<StudentDetails>> getStudentDetails() {
		return new ResponseEntity<Set<StudentDetails>>((Set<StudentDetails>) studentInterface.getStudentDetails(),
				HttpStatus.ACCEPTED);
	}

}

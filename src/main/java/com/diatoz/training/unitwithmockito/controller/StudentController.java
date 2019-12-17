package com.diatoz.training.unitwithmockito.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diatoz.training.unitwithmockito.domain.StudentDetails;
import com.diatoz.training.unitwithmockito.domain.StudentDetailsDto;
import com.diatoz.training.unitwithmockito.service.StudentInterface;

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

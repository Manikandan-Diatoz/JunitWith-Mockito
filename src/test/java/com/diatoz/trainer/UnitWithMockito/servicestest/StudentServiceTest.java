package com.diatoz.trainer.UnitWithMockito.servicestest;
import static com.diatoz.trainer.UnitWithMockito.servicestest.GetDummyObjects.getDummyStudent;
import static com.diatoz.trainer.UnitWithMockito.servicestest.GetDummyObjects.getDummyStudentDetailsDto;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.diatoz.training.unitwithmockito.domain.StudentDetails;
import com.diatoz.training.unitwithmockito.domain.StudentDetailsDto;
import com.diatoz.training.unitwithmockito.repostiory.StudentDetailRepo;
import com.diatoz.training.unitwithmockito.service.StudentDetailsService;

@ExtendWith(SpringExtension.class)
public class StudentServiceTest {
	@Mock
	private StudentDetailRepo studentDetailRepo;
	@InjectMocks
	private StudentDetailsService studentDetailsService;
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.initMocks(StudentServiceTest.class);
	}
	@DisplayName("Test save service for StudentDetail ")
	@Test
	public void saveNewStudentDetail() throws Exception {
		StudentDetailsDto studentDetailsdto = getDummyStudentDetailsDto();
		StudentDetails studentDetails = getDummyStudent();
		when(studentDetailRepo.save(Mockito.any(StudentDetails.class))).thenReturn(studentDetails);
		assertEquals(studentDetails, studentDetailsService.addnewStudent(studentDetailsdto));
		System.out.println(studentDetailsService.addnewStudent(studentDetailsdto));
	}
	@DisplayName("Test get All service for StudentDetail")
	@Test
	public void getAllStudents() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		StudentDetails studentDetails = new StudentDetails();
		
		studentDetails.setStudentRollno(Integer.valueOf(1));
		
		studentDetails.setStudentName("Manikandan");
		StudentDetails studentDetails1 = new StudentDetails();
		studentDetails1.setStudentRollno(Integer.valueOf(2));
		studentDetails1.setStudentName("siva");
		List<StudentDetails> studentList = new ArrayList<>();
		Set<StudentDetails> studentDetailSet = new HashSet<>();
		studentList.add(studentDetails1);
		studentList.add(studentDetails);
		studentDetailSet.add(studentDetails1);
		studentDetailSet.add(studentDetails);
		when(studentDetailRepo.findAll()).thenReturn(studentList);
		assertEquals(studentDetailsService.getStudentDetails(), studentDetailSet);
	}
}

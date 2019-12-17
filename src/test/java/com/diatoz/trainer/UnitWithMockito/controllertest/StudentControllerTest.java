package com.diatoz.trainer.UnitWithMockito.controllertest;

import static com.diatoz.trainer.UnitWithMockito.servicestest.GetDummyObjects.getDummyStudentDetailsDto;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.MockMvcBuilderCustomizer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.diatoz.training.unitwithmockito.domain.StudentDetailsDto;
import com.google.gson.Gson;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@WebAppConfiguration
public class StudentControllerTest {
	 
	@Autowired
	private WebApplicationContext webApplicationContext;
	

	private MockMvc mockMvc;
	
	@BeforeEach
	public void setup()
	{
		this.mockMvc=MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	@DisplayName("Test for Create StudentDetailController")
	@Test
	public void addNewStudent()throws Exception
	{
		StudentDetailsDto studentDetailsDto=getDummyStudentDetailsDto();
			
			final String URL="/student/addStudent";
			mockMvc.perform(post(URL).contentType(MediaType.APPLICATION_JSON_UTF8)
					.accept(MediaType.APPLICATION_JSON_UTF8).content(objectToJson(studentDetailsDto))).andReturn();
			
			
	}
	public String objectToJson(StudentDetailsDto studentDetailsDto) {
		Gson gson = new Gson();
		return gson.toJson(studentDetailsDto);
	}
	public void getAllStudents() throws Exception
	{
		mockMvc.perform(get("/student/getAllStudent").contentType(MediaType.APPLICATION_JSON_UTF8)).andDo(print()).andExpect(status().isAccepted());
	}
}

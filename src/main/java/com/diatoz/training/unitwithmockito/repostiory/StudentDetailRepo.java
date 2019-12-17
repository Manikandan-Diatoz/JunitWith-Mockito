package com.diatoz.training.unitwithmockito.repostiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diatoz.training.unitwithmockito.domain.StudentDetails;


@Repository
public interface StudentDetailRepo extends JpaRepository<StudentDetails, Integer>{
	
	

}

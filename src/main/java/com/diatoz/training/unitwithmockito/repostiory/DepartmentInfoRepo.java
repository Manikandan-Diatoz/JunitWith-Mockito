package com.diatoz.training.unitwithmockito.repostiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diatoz.training.unitwithmockito.domain.Department;


@Repository
public interface DepartmentInfoRepo extends JpaRepository<Department, Integer>{
	

}

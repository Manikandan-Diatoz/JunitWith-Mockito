package com.diatoz.trainer.UnitWithMockito.repostiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diatoz.trainer.UnitWithMockito.domain.Department;


@Repository
public interface DepartmentInfoRepo extends JpaRepository<Department, Integer>{
	

}

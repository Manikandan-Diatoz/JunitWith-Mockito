package com.diatoz.trainer.UnitWithMockito.service;
import java.util.Set;
import com.diatoz.trainer.UnitWithMockito.domain.Department;
import com.diatoz.trainer.UnitWithMockito.domain.DepartmentDto;
public interface DepartmentInfo
{
	Department addnewDepartment(DepartmentDto departmentdto);
	Set<Department> getAllDepartments();
}

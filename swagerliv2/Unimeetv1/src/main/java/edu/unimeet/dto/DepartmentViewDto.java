package edu.unimeet.dto;

import java.io.Serializable;

import edu.unimeet.entities.Department;
import edu.unimeet.entities.User;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepartmentViewDto implements Serializable {
	private static final long serialVersionUID = 1L;
	Integer deptId;
	String DeptName;

	public DepartmentViewDto(String deptName,Integer deptId) {
		this.deptId = deptId;
		this.DeptName = deptName;
	}
	
	 public static DepartmentViewDto of(Department dept) {

	        return new DepartmentViewDto(dept.getDeptName(),dept.getDeptId());}

	public DepartmentViewDto() {

	}
	
	
	

}

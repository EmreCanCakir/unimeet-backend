package edu.unimeet.dto;

import java.io.Serializable;

import edu.unimeet.entities.Post;
import edu.unimeet.entities.UniDept;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class UniDeptViewDto implements Serializable {
	private static final long serialVersionUID = 1L;
	Integer uniDeptId ;
	private DepartmentViewDto departmentViewDto;
	private UniViewDto uniViewDto;
	private UniDeptViewDto(DepartmentViewDto departmentViewDto, UniViewDto uniViewDto,Integer uniDeptId ) {
		this.departmentViewDto = departmentViewDto;
		this.uniViewDto = uniViewDto;
		this.uniDeptId = uniDeptId;
	}
	
	public static UniDeptViewDto of(UniDept uniDept) {
		if(uniDept == null) {
			return null;}
		else {
        return new UniDeptViewDto(DepartmentViewDto.of(uniDept.getDepartments()),UniViewDto.of(uniDept.getUniversities()),uniDept.getUniDeptId());}

    }

	public UniDeptViewDto() {
		super();
	}
	
	

}

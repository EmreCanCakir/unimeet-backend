package edu.unimeet.entities;

import lombok.*;

import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import edu.unimeet.dto.DepartmentViewDto;
import edu.unimeet.dto.PostViewDTO;
import edu.unimeet.dto.UniDeptViewDto;
import edu.unimeet.dto.UserViewDTO;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DeptID")
    private Integer deptId;


    @Column(name = "DeptName")
    private String deptName;


    @OneToMany(mappedBy = "departments")
    @Cascade(CascadeType.ALL)
    private List<UniDept> uniDept;
    
    public static Department of(DepartmentViewDto departmentViewDto) {
    	

        return new Department(departmentViewDto.getDeptId(),departmentViewDto.getDeptName());

    }

	public Department(String deptName) {
		this.deptName = deptName;
	}

	public Department(Integer deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

}
package edu.unimeet.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import edu.unimeet.dto.DepartmentViewDto;
import edu.unimeet.dto.UniDeptViewDto;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "unidept")
public class UniDept {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UniDeptId")
    private Integer uniDeptId;

 

    @ManyToOne
    @JoinColumn(name="dept_id")
    private Department departments;


    @ManyToOne
    @JoinColumn(name="uni_id")
    private University universities;
    

//    @OneToMany(mappedBy = "uniDept")
//    @Cascade(CascadeType.ALL)
//    private List<Department> departments;
//
//
//    @OneToMany(mappedBy = "uniDept")
//    @Cascade(CascadeType.ALL)
//    private List<University> universities;


    public UniDept(Department departments, University universities) {
		this.departments = departments;
		this.universities = universities;
	}
    
 public static UniDept of(UniDeptViewDto uniDeptViewDto) {
    	

        return new UniDept(uniDeptViewDto.getUniDeptId(),Department.of(uniDeptViewDto.getDepartmentViewDto()),University.of(uniDeptViewDto.getUniViewDto()));

    }


	 public UniDept(Integer uniDeptId, Department departments, University universities) {
	super();
	this.uniDeptId = uniDeptId;
	this.departments = departments;
	this.universities = universities;
}


	@OneToMany(mappedBy = "uniDept",orphanRemoval = true)
	 @Cascade(CascadeType.ALL)
 
    private List<User> users;

}
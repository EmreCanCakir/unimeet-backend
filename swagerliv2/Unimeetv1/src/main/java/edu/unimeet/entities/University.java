package edu.unimeet.entities;

import lombok.*;

import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import edu.unimeet.dto.DepartmentViewDto;
import edu.unimeet.dto.UniViewDto;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tb_University")
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UniID")
    private Integer uniId;

    public University(String uniName) {
		this.uniName = uniName;
	}

	@Column(name = "UniName")
    private String uniName;

    @OneToMany(mappedBy = "universities")
    @Cascade(CascadeType.ALL)
    private List<UniDept> uniDept;
    
    
  public static University of(UniViewDto uniViewDto) {
    	

        return new University(uniViewDto.getUniID(),uniViewDto.getUniName());

    }


public University(Integer uniId, String uniName) {
	super();
	this.uniId = uniId;
	this.uniName = uniName;
}

}
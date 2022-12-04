package edu.unimeet.dto;

import java.io.Serializable;

import edu.unimeet.entities.Department;
import edu.unimeet.entities.University;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UniViewDto implements Serializable {
	public UniViewDto() {
		
	}
	private static final long serialVersionUID = 1L;
	Integer uniID;
	String UniName;

	public UniViewDto(String uniName,Integer uniID) {
		this.uniID = uniID;
		this.UniName = uniName;
	}
	public static UniViewDto of(University uni) {

        return new UniViewDto(uni.getUniName(),uni.getUniId());}
	
	
	

}

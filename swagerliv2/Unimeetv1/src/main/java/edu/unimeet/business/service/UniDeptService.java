package edu.unimeet.business.service;

import java.util.List;

import edu.unimeet.dto.UniDeptViewDto;
import edu.unimeet.entities.UniDept;

public interface UniDeptService {
	List<UniDeptViewDto> getAll();

}

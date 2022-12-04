package edu.unimeet.business.service;

import edu.unimeet.dto.DepartmentViewDto;
import edu.unimeet.entities.Department;

import java.util.List;

public interface DepartmentService {

    List<DepartmentViewDto> getAll();

}

package edu.unimeet.business.service;

import edu.unimeet.dto.UniViewDto;
import edu.unimeet.entities.University;

import java.util.List;

public interface UniversityService {

    List<UniViewDto> getAll();

}

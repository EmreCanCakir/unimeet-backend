package edu.unimeet.business.service;

import java.util.List;

import edu.unimeet.dto.CommentCreateDTO;
import edu.unimeet.dto.CommentViewDTO;
import edu.unimeet.dto.DepartmentViewDto;

public interface CommentService {

	List<CommentViewDTO> getAll();
	CommentCreateDTO createcomment(CommentCreateDTO createcomment);
	
}

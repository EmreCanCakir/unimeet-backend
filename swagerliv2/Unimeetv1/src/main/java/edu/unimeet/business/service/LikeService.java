package edu.unimeet.business.service;

import java.util.List;

import edu.unimeet.dto.LikeCreateDTO;
import edu.unimeet.dto.LikeViewDTO;
import edu.unimeet.dto.UniDeptViewDto;

public interface LikeService {
	List<LikeViewDTO> getAll();
	
	LikeCreateDTO createLike(LikeCreateDTO likeCreateDTO);
	
}

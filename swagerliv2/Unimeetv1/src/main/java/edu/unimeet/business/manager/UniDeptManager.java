package edu.unimeet.business.manager;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import edu.unimeet.business.service.UniDeptService;
import edu.unimeet.dto.PostViewDTO;
import edu.unimeet.dto.UniDeptViewDto;
import edu.unimeet.entities.UniDept;
import edu.unimeet.repository.UniDeptRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UniDeptManager implements UniDeptService {
	private final UniDeptRepository uniDeptRepository;
	
	
	@Override
	public List<UniDeptViewDto> getAll() {
		// TODO Auto-generated method stub
		return uniDeptRepository.findAll().stream().map(UniDeptViewDto::of).collect(Collectors.toList());
	}
	

}
